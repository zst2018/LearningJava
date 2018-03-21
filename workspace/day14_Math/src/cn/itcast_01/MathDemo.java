package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午2:12:56 
* 类说明 
* Math类：用于数学运算的类
* 成员变量：
* 	public static final double pi
* 	public static final double e\
* 成员方法
* 	public static double ceil(double a) 向上取整
* 	public static int abs(int a)  绝对值
*   public static double floor(double a)  向下取整
*   public static int max(int a,int b) min（自学） 最大值
*   public static double pow(double a,double b) 返回第一个参数的第二个幂次数
*   public static int round(float a) 参数类型为 double 的自学 四舍五入
*   public static double sqrt(double a) 返回 a 的正平方根
*   
*   
* 
*/
public class MathDemo {
	public static void main(String[] args) {
		System.out.println("pi:"+Math.PI);
		System.out.println("E:"+Math.E);
		System.out.println();
		System.out.println("abs:"+Math.abs(10));
		System.out.println("abs:"+Math.abs(-19));
		System.out.println();
		
		System.out.println("ceil:"+Math.ceil(12.34));
		System.out.println("ceil:"+Math.ceil(12.67));
		System.out.println();
		
		System.out.println("floor:"+Math.floor(12.34));
		System.out.println("floor:"+Math.floor(12.67));
		System.out.println();
		
		System.out.println("max:"+Math.max(12,34));
		//需求：我要获取三个数据中的最大值
		//方法的嵌套调用
		System.out.println("max:"+Math.max(Math.max(12,34),78));
		//要求：获取是个数据中的最大值
		System.out.println("max:"
				+Math.max(Math.max(12,34),Math.max(45,34) ));
		
		System.out.println("pow:"+Math.pow(2,3));
		
		System.out.println("round:"+Math.round(12.56));
		System.out.println("round:"+Math.round(12.45));
		
		
		
	}

}














