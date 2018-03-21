package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月24日 下午3:47:17 
* 类说明 
* 
* protected void finalize()
* 当垃圾回收器确定不存在对该对象的更多引用时，
* 由对象的垃圾回收器调用此方法。
* 用于垃圾回收，但是什么时候回收，不确定
* 
* protected Object clone()创建并返回此对象的一个副本，
* A  重写该方法 
* Cloneable 接口 是没有方法的接口，叫做标记接口。告诉我们实现该接口的类就可以实现对象的复制了
* 此类实现了Cloneable 接口，以指示Object.clone() 方法可以合法的对该类实例进行按字段复制
* 
* 
*/
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//创建学生对象
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(23);
		//克隆学生对象
		Object obj= s.clone();
		Student s2 = (Student)obj;
		System.out.println();
		
		System.out.println(s.getName()+"===="+s.getAge());
		System.out.println(s2.getName()+"====="+s2.getAge());
		
		//以前的做法
		Student s3=s;
		System.out.println(s3.getName()+"-----"+s3.getAge());
		
		System.out.println();
		//区别
		s3.setName("留意");
		s3.setAge(34);
		System.out.println(s.getName()+"-----"+s.getAge());
		System.out.println(s2.getName()+"-----"+s2.getAge());
		System.out.println(s3.getName()+"-----"+s3.getAge());
		
		
	
	
	}
}
