package cn.itcast.test;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午1:50:03 
* 类说明 
*/
public class ToolDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		
		Tool t = new Tool();
		
		t.setProperty(p,"name", "林青霞");
		t.setProperty(p, "age", 27);
		
		System.out.println(p);
	}

}

class Person{
	private String name;
	public int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age +"]"	;
	}
	
}
