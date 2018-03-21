/*
数组查表法
*/
import java.util.Scanner;
class AeeayTest5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入索引值（0~6）：");
		int index=sc.nextInt();
		String[] a={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(a[index]);

	}
}