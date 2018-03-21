/*
练习：
A，获取两个数中较大的数
B:判断一个数是奇数还是偶数

*/
import java.util.Scanner;//导包
class ControlTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();//从对象获取数据
		System.out.println("请输入第二个数：");
		int b=sc.nextInt();//从对象获取数据
		if(a>b){
			System.out.println("a比b大");

		}else{
			System.out.println("b比a大");
		}
		if(a%2==0){//判断a的奇偶性
			System.out.println("a是偶数");
		}else{
			System.out.println("a是奇数");
		}
		System.out.println("over");
	}


}