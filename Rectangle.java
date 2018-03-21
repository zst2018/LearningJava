/*
定义一个长方形的类，定义  求周长和面积的方法
然后进行测试

*/
//注意，在键盘录入时，导包的语句一定要放在第一个class的前面
import java.util.Scanner;
//创建基本类
class RectangleDemo{
	//定义类的两个成员变量：长和宽
	private double length;
	private double width;
	//创建成员方法    周长    方法带两个double类型的参数，并且有返回值
	public double grith(double length,double width){
		this.length=length;
		this.width=width;
		//double grith=2*(length+width);
        //return grith;
        //可以如下改进
        return 2*(length+width);
	}
	//创建成员方法   面积    方法带两个double类型的参数，并且有返回值
	public double area(double length,double width){
		this.length=length;
		this.width=width;
		//double area=length*width;
		//return area;
		//可以如下改进
		return length*width;
	}
}
//创建测试类

class Rectangle{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入长");
		double length=sc.nextDouble();
		System.out.println("请输入宽");
		double width=sc.nextDouble();
		//创建对象
		RectangleDemo r=new RectangleDemo();
		//通过对象调用周长的方法
		double m=r.grith(length,width);
		//通过对象调用面积的方法
		double n=r.area(length,width);
		//在控制台输出长方形的面积与周长
		System.out.println("长方形的周长是："+m);
		System.out.println("长方形的面积是："+n);
	}
}

