class Animal{
	public void eat(){
	System.out.println("eat animal");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("eat Cat");
	}
	public void palyGame(){
		System.out.println("playGame Cat");
    }

}
class Dog extends Animal{
	public void eat(){
		System.out.println("eat Dog");
	}
	public void lookDoor(){
		System.out.println("lookDoor Dog");
	}
}
class Demo3{
	public static void main(String[] args){

		//向上转型
		Animal a=new Dog();
		a.eat();

		//a.lookDoor();
		System.out.println();

		//向下转型
		Dog d=(Dog) a;
		d.eat();
		d.lookDoor();
		System.out.println();

		//将 父类的 变量 a  指向新的对象  new Cat()
		a = new Cat();
		a.eat();
 

		//a.playGame();
		System.out.println();

		//向下转型
		Cat c=(Cat) a;
		c.eat();
		c.palyGame();

		Dog dd=(Dog) a; //Exception in thread "main" java.lang.ClassCastException:
		                //Cat cannot be cast to Dog

	}
}