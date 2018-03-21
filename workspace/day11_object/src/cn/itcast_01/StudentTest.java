package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月23日 下午10:05:58 
* object 类的方法
* public int hashCode():返回该对象的哈希码值
* 注意：哈希值是根据哈希算法换算出来的一个值，这个值和地址值有关，但是不是实际地址值，
* 你可以理解为地址值
* public final Class getClass();
* 返回object 运行时类    反射待讲
* 真实返回的是该类的对象
* 		Class 类的方法
* 			public String getName();以String 的形式返回此Class对象所
* 			表示的实体（类，接口，数组类，基本类或viod）名称
*/
//每个类都直接或者间接的继承了Object 类
//Object类是类层次结构的根类。每个类都使用object 作为超类
public class StudentTest {
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		
		Student s3=s1;
		System.out.println(s3.hashCode());
		System.out.println();
		//创建对象
		Student s = new Student();
		//通过对象调用getClass方法  ，方法的返回值类型是 Class 类型
		Class c=s.getClass();
		//通过返回的类的对象，调用给类的方法，getName（）  返回字符串类型
		String str = c.getName();
		System.out.println(str);
		//通过调用该方法，返回object的运行时类的字符串名称
		
		
		//链式编程
		String str2=s.getClass().getName();
		System.out.println(str2);
		
		
		
	}

}
