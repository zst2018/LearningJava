/*

需求：
	创建一个员工类，
	自己定义有几个成员变量，构造方法，getXxx()/setXxx()方法。
	以及一个显示所有变量的show方法
成员变量
		员工编号，姓名，年龄。

*/
class StaffDemo{
	private String name;
	private int age;
	private String staffnumber;
	//构造方法
	public StaffDemo(){};
	//获取变量
	public String getName(){
		return name;
	}
	public String getStaffnumber(){
		return staffnumber;
	}
	public int getAge(){
		return age;
	}
	//给变量赋值
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setStaffnumber(String qqnumber){
		this.staffnumber=staffnumber;
	}
	//show 方法实现所有的一次性出输出所有变量值
	public void show(){
		System.out.println(name+"   "+age+"   "+staffnumber);

}
	}
class Staff{
	public static void main(String[] args){
		//创建对象
		StaffDemo s=new StaffDemo();
		//给各个变量赋值
		s.setName("hihoa");
		s.setAge(89);
		s.setStaffnumber("45868986");
		//通过字符拼接实现一次性输出所有的变量值
		System.out.println(s.getAge()+"   "+s.getStaffnumber()+"   "+s.getName());
		//直接调用方法就可以了。不用再输出一次    [  纠正的错误]
		//System.out.println(s.show());
		s.show();

	}
}