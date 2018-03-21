
import java.util.Scanner;
class ControlTest4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b=sc.nextInt();
		System.out.println("请输入第三个数据：");
		int c=sc.nextInt();
		int max;
		//int max=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		//System.out.println("max:"+max);
		if(a>c){
			if(a>b){
				max=a;
			}else{
				max=b;
			}
		}else {
			if(c>b){
				max=c;
			}else{
				max=b;
			}
		}//if 语句的嵌套使用
			System.out.println("max:"+max);
	}
}
