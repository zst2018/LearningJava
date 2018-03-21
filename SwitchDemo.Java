 /*
switch 语句格式：
switch(表达式){
	case 值1；
	语句体1；
	break；
	case 值2；
	语句体2；
	break；
	。。。
	default；
	语句体N+1；
	break；
}
格式解释：
switch：表示这是switch选择结构
表达式：这个地方的取值是有限定的
byte short int char
JDK5以后可以是枚举
JDK7以后可以是字符串
Case：后面跟的是要和表达式进行比较的值
语句体：要执行的代码
break：表示中断，结束的意思，可以控制switch语句的结束
default：当所有的值都和表达式不匹配的时候，要执行default控制的语句
相当于if语句的else

面试题：
byte可以作为switch的表达式吗？可以
long 可以作为switch的表达式吗？[可以]
string可以作为switch的表达式吗？JDK7 以后可以
案例：
键盘录入一个数据，根据这个数据，我们输出对应的星期
键盘录入1，对应输出星期一
键盘录入2，对应输出星期二
。。。。
键盘录入7，对应输出星期日



 */
import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
     //从对象获取数据
		System.out.println("请输入一个数据");
		int week =sc.nextInt();

		//switch判断语句
		switch(week) {
			case 1:
			System.out.println("星期一");
			break ;
			case 2:
			System.out.println("星期二");
			break ;
			case 3:
			System.out.println("星期三");
			break ;
			case 4:
			System.out.println("星期四");
			break;
			case 5:
			System.out.println("星期五");
			break;
			case 6:
			System.out.println("星期六");
			break;
			case 7:
			System.out.println("星期日");
			break;
			default:

			System.out.println("你输入的数据有误");
			break ;
		}




	}

}