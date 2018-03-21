/*
封装和private 应用
	把成员变量用Private修饰
	提供对用的getXxx  setXxx
this 关键字  是java中定义的代表当前类的对象名
			哪个对象调用那个方法，this就代表哪个对象


*/
class Student{
	//姓名
	private String name;
	//年龄
	private int age;
	public String getName(){
		return name;//这里其实隐含了this 
	}
	public void setName(String name ){
		this.name=name;

	}
	//获取值
	public int getAge(){
		return age;
	}

	//赋值
	public void setAge(int age){
		//this 关键字代表本类的对象
		//age=age;[变量的使用规则是就近原则，]
		this.age=age;
	}

}
class StudentTest{
	public static void main(String[] args){
		Student s1=new Student();
		//错误。被私有修饰了，外界不能直接访问了
		//System.out.println(s.name+"   "+s.age);
		System.out.println(s1.getName()+"    "+s1.getAge());
		//给成员变量赋值
		s1.setAge(89);
		s1.setName("nihao "); 

		System.out.println(s1.getName()+"    "+s1.getAge());
		Student s2=new Student();
		s2.setAge(12);
		s2.setName("hurhtr");
		System.out.println(s2.getAge()+"   "+s2.getName());

	}
}
 
