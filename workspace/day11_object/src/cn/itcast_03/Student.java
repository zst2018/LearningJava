package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月24日 下午3:17:18 
* 类说明 
*/
public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(){
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean equals(Object obj){
		//提高效率
		if(this==obj){
			return true;
		}
		//为了提高程序的健壮性
		//我先判断，obj 是不是学生的一个对象，如果是，再做向下转型
		//如果不是，直接返回false
		//这个时候。我们要判断是对象是否是某个类的对象
		//记住一个格式：对象名  instanceof 类名
		//表示：判断该对象名是否是该类名的一个对象
		if(!(obj instanceof Student)) {
			return false;
			
		}
		//如果是就继续
		
		
		
		//还是调用的Object类的equals方法
		//return super.equals(obj);
		//return true;
		//这里改进，根据这里比较的成员变量来决定返回true还是false
		//但是，name 是String类型的，而String是引用类型的，所以不能直接用等于号比较
		//应该用equals 方法
		// String 的equals()方法是重写自object类的，比较的是字符串的内容是否相同
		
		//this--s1
		//obj--s2
		//通过多态的方式，父类的对象不能访问子类特有的
		// 我们使用的学生类的特有成员变量，所以向下转型
		Student s = (Student)obj;//s---obj--s2
	/*	if(this.name.equals(s.name)&&this.age==s.age){
			return true;
		}else{
			return false;
		}*/
		System.out.println("同一个对象，还需要向下转型并比较吗？");
		return this.name.equals(s.name)&&this.age==s.age;
		
		
	}
	
	
	
	

}
