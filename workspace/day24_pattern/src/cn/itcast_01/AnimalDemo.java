package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午2:17:00 
* 类说明 
*/
public class AnimalDemo {
	public static void main(String[] args) {
		//具体类调用
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println();
		
		//有了工厂后
//		Dog d1 = AnimalFectory.createDog();
//		Cat c1 = AnimalFectory.createCat();
//		d1.eat();
//		c1.eat();
		
		//工厂改进后
		//Dog d = AnimalFectory.createAnimal("dog");
		Animal a = AnimalFectory.createAnimal("dog");
		a.eat();//狗吃肉
		
		a = AnimalFectory.createAnimal("cat");
		a.eat();//猫吃鱼
		
		a=AnimalFectory.createAnimal("pig");
		if(a!=null){
			a.eat();
		}else{
			System.out.println("对不起暂时不提供这种服务");
		}
		//a.eat();
		
		
		
	}

}