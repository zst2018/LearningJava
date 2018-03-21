/*
if 语句格式第三种
//键盘录入一个成绩数据，并判断成绩的等级
//注意：在做一个程序的基本测试时，一定要考虑如下问题
A：正确数据，错误数据，边界数据
 


*/
import java.util.Scanner;
class ControlTest2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int a=sc.nextInt();
		if(a>100|a<0){
			System.out.println("成绩不合法");
	

		}else if(a<=100 &a>=90){
			System.out.println("优秀");
		}else if(a<90 & a>=70){
			System.out.println("良");
		}else if(a<70 &a>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		System.out.println("thank you !");
	}
}