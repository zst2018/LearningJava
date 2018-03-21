/*
修饰符 返回值类型  方法名（参数类型 参数名1，参数类型 参数名2...）{
	方法体语句；
	return 返回值；
}
修饰符：目前只用  public static 
返回值类型：即是功能结果的数据类型，
方法名：符合命名规则即可，方便调用
参数：(实际参数，形式参数)
	实际参数：就是实际参与运算的
	形式参数：就是方法定义的，用于接收实际参数
参数类型：就是参数的数据类型
参数名：变量名
方法体语句：就是完成功能的代码
return：结束方法的
返回值：就是功能的结果，由return带给调用者
要想写好一个代码》首先要明确两个东西：
A 返回值类型
	结果的数据类型
B 参数列表
	你要传递几个参数，以及每个参数的数据类型

需求：求两个数据之和
明确：返回值类型（int）
		参数列表（2个 int）
方法的执行特点：
不调用不执行
如何调用（有明确返回值的调用）
调用方式1：
单独调用sum(a,b)，一般来说没有意义，所以不推荐，前提是有明确返回值   调用时不加数据类型
方式2：
输出调用 有意义但是不够好，因为我们可能需要对结果进行进一步的计算   System.out.println(sum(a,b));
方式3：
赋值调用  int result=sum（a,b）；
System.out.println（result）；



*/
import java.util.Scanner;
class MeanDemo{
	//第一步，程序从main方法开始执行
	public static void main(String[] args){  
		//定义两个int的变量
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b=sc.nextInt();
		//第三步，调用方法
		int c=sum(a,b);//方法调用，注意调用方法中的变量要和主方法中的变量名一致
		//第七步，输出结果c 
		System.out.println(c);

	}
	//方法
	//第四步，分别把主方法中变量a,b 的值赋给sum 方法中的x.y
	public static int sum(int x,int y){
		//第五步，把x+ y的值计算出来，
		//第六步，通过return把计算的结果值返回给   int c=sum(a,b)中的c 
		return (x+y);
	}
}
