package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午2:50:13 
* 类说明 
*/
public class AnimalDemo {
	public static void main(String[] args) {
		
		//需求，我要买只狗
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();
		System.out.println();
		
		//需求，买一只猫
		f = new CatFactory();
		a = f.createAnimal();
		a.eat();
		
		
		
		
		
	}

}
