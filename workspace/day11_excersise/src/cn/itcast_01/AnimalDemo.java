package cn.itcast_01;



import com.zst_02.Dog;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月23日 下午5:22:21 
* 类说明 
*/
public class AnimalDemo {
	public static void main(String[] args){
	// 抽象类不能实例化
//		Animal a= new Cat();
//		a.eat();
//		a.sleep();
//		System.out.println();
		
		Dog b=new Dog();
		b.eat();
		b.sleep();
		b.jump();
		
		
		
		
		
		
	}

}
