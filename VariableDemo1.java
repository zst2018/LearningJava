/*
1位置不同：
成员变量：类中方法外
局部变量：在方法定义中，或者方法声明中
2.在内存中的位置不同
成员变量：在堆中
局部变量：在栈中
3.生命周期不同
成员变量：随着对象的创建而存在
局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
4.初始化值不同
成员变量：有默认值，每个类型的初始化值不同
局部变量：没有默认初始化值，必须定义，赋值后才可以参与程序的运行

注意事项：
		局部变量名称可以和成员变量名称一样，在方法中采用的时候，是就近原则。

*/
class Variable{
	//类中方法外，是成员变量
	//int num=10;
	int num;
	public void show(){
		//方法中，是局部变量
		int num2=19;
		//int num1;[在该方法中没有定义变量后进行赋值] 
		int num1=89;
		System.out.println(num1);
		//int num=189;
		System.out.println(num);//[当上行注释掉后，最近的NUM是 类中方法外的成员变量 ]
	}
}
class VariableDemo1{
	public static void main(String[] args){
		Variable v=new Variable();
		System.out.println(v.num);
		//System.out.println(v.show);[错误]
		v.show();


	}
}