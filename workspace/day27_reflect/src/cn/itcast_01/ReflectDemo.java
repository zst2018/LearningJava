package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午3:16:39 
* 类说明 
* 反射就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法
* 首先要得到class文件对象，其实就是得到Class类的对象
* Class类：
* 	成员变量   Field
* 	构造方法	 Constructor
* 	成员方法   Method
* 通过class文件得到Class对象，调用方法，得到Field Constructor Method 等类的对象，
* 再调用对应的成员变量，构造方法，成员方法
* 获取Class对象的方式
*A  Object类的getClass（） 方法
* B  数据类型的静态属性 class
* C Class 类的静态方法
* 	public static Class forName(String className)
* 注意：此处 String className 要写带包名的全路径
* 一般三种方式的使用
* 自己玩   人选一种，第二种较为方便
* 开发        第三种，因为第三种是一个字符串而不是一个具体的类名，
* 		这样我们就可以把这样的字符串配置到配置文件中
*/
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//获取字节码对象
		//方式1
		Person p = new Person();
		//获取Person.class文件对象
		Class c = p.getClass();
		
		Person p2 = new Person();
		//获取Person.class 文件对象
		Class c2 = p2.getClass();
		
		System.out.println(p==p2);//false
		System.out.println(c==c2);//true
		
		//方式2
		 Class c3 = Person.class;
//		 int.class;
//		 String.class;
		 System.out.println(c==c3);//true
		
		 //方式3
		 //ClassNotFoundException
		// Class c4 = Class.forName("cn.itcast_01\\Person");
		 Class c4 = Class.forName("cn.itcast_01.Person");

		 System.out.println(c==c4);
	}

}















