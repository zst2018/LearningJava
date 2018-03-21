/*
南方人 和北方人的案例

*/
class Person{
	public void eat(){
		System.out.println("吃饭");
	}
	
}
class SouthPerson extends Person{
	public void eat(){
		System.out.println("精致小菜+大米");
	}
	public void jiangshang(){
		System.out.println("商业");
	}
	
}
class NorthPerson extends Person{
	public void eat(){
		System.out.println("大锅菜+面食");
	}
	public void yanjiu(){
		System.out.println("科研");
	}
}
class PolymTest3{
	public static void main(String[] args){
		Person p=new SouthPerson();
		p.eat();

		SouthPerson s = (SouthPerson) p;
		s.eat();
		s.jiangshang();

		p=new NorthPerson();
		p.eat();

		NorthPerson n=(NorthPerson) p;
		n.eat();
		n.yanjiu();




	}
}