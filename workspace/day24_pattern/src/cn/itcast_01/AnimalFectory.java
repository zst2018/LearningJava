package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午2:18:55 
* 类说明 
*/
public class AnimalFectory {
	private AnimalFectory(){
		
	}
//	public static Dog createDog(){
//		return new Dog();
//	}
//	
//	public static Cat createCat(){
//		return new Cat();
//	}
	public static Animal createAnimal(String type){
		if("dog".equals(type)){
			return new Dog();
		}else if("cat".equals(type)){
			return new Cat();
		}else{
			return null;
		}
	}

}
