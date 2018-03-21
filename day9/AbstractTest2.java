/*
假如在开发一个系统时，需要对员工类进行设计，员工包括三个属性：姓名 工号 工资
经理也是员工，除了会有员工的属性外，另外还有一个奖金属性
分析：
员工类：
成员变量：姓名 工号 工资
成员方法：工作 
普通员工类：
 成员变量：姓名 工号 工资
 成员方法：工作
经理类：
成员变量：姓名 工号 工资 奖金
成员方法：工作

实现：
员工类
普通员工类
经理类
测试类

*/
 abstract class Employee{
 	private String name;
 	private String number;
 	private int salary;

 	public Employee(){}
 	public Employee(String name,String number,int salary){
 		this.name=name;
 		this.number=number;
 		this.salary=salary;
 	}
 	public void setName(String name){
 		this.name=name;
 	}
 	public String getName(){
 		return name;
 	}
 	public void setNumber(String number){
 		this.number=number;
 	}
 	public String getNumber(){
 		return number;
 	}
 	public void setSalary(int  salary){
 		this.salary=salary;
 	}
 	public int  getSalary(){
 		return salary;
 	}
 	

 	public abstract void work();
	
}
class SubEmployee extends Employee{
	public SubEmployee(){}
	public SubEmployee(String name,String number,int salary){
		super(name,number,salary);
	}
	public void work(){
		System.out.println("work SubEmployee");
	}

}
class Manigger extends Employee{
	private int reword;
	public void setReword(int reword){
		this.reword=reword;
	}
	public int getReword(){
		return reword;
	}
	
	public Manigger(){}
	public Manigger(String name,String number,int salary,int reword){

		super(name,number,salary);
		this.reword=reword;
		
	}
	public void work(){
		System.out.println("work Manigger");
	}

}
class AbstractTest2{
	public static void main(String[] args){
		//多态方式
		Employee e=new SubEmployee();
		e.setName("李炒");
		e.setNumber("75843");
		e.setSalary(3247);
		e.work();
		System.out.println(e.getName()+"   "+e.getNumber()+"   "+e.getSalary());

		System.out.println();
		e=new SubEmployee("李主","84957",34875);
		System.out.println(e.getName()+"   "+e.getNumber()+"   "+e.getSalary());
		e.work();
		System.out.println();

		//由于子类中有特有的东西，所以用子类来测试
		//具体方式
		Manigger m=new Manigger();

		m.setName("真不");
		m.setNumber("46456");
		m.setSalary(9067);
		m.setReword(89543);
		m.work();


		System.out.println(m.getName()+"   "+m.getNumber()+"   "+m.getSalary()+"   "+m.getReword());
		System.out.println();

		m=new Manigger("继而","689332",9865,7854);
		System.out.println(m.getName()+"   "+m.getNumber()+"   "+m.getSalary()+"  "+m.getReword());
		m.work();
		System.out.println();








	}
}