/*
x>=3,y=2*x+1
x>=-1,x<3,y=2*x;
x=其他,y=2*x-1

*/
/*
键盘录入月份的值，输出对应的季节
春：3.4.5
夏:6.7.8
秋:9.10.11
冬12.1.2

*/
import java.util.Scanner;//导包
class ControlTest3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入月份：");
		int month=sc.nextInt();//从对象获取数据
		if(month<1||month>12){
			System.out.println("输入月份有误");
		}else if(month>=3 && month<=5){//(month ==3||month==4||month==5)
			System.out.println("输入月份在春季");
		}else if(month>=6 && month<=8){//(month==6||month ==7||month==8)
			System.out.println("输入月份在夏季");

		}else if(month>=9 && month<=11){//(month==9||month==10||month==11)
			System.out.println("输入月份在秋季");
		}else{
			System.out.println("输入月份在冬季");
		}
			System.out.println("thank you!");
	}
}
