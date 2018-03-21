/*
需求：打印杨辉三角形（行数可以键盘录入）
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
a[i][j]=a[i-1][j-1]+a[i-1][j]
分析：看这种图形的规律
	A 任何一行的不第一列和最后一列都是1
	B 从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和
步骤：
	A；



*/
import java.util.Scanner;
public class Array2Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int line_number = sc.nextInt();
		//定义二维数组
		int[][] a = new int[line_number][line_number];
		for(int i=0;i<line_number;i++){
			//第i行的第一列是0
			a[i][0]=1;
			//其他数据根据规律赋值
			for(int j=1;j<i;j++){
				//每一个数据是它上一行的前一列和它上一行的本列之和
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
			//第i行的第i列是1
			a[i][i]=1;
		
		}
		//遍历数组
		for(int i=0;i<line_number;i++){
			//内循环的变化和九九乘法表类似
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		}
	}
}