package cn.itcast_05;

import java.util.ArrayList;
import java.util.Collection;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午8:58:41 
* 类说明 
*泛型    通配符
*/
public class GenericDemo {
	public static void main(String[] args) {
		Collection<Object>  c1= new ArrayList<Object>();
//		Collection<Object>  c2= new ArrayList<Animal>();
//		Collection<Object>  c3= new ArrayList<Dog>();
//		Collection<Object>  c4= new ArrayList<Cat>();
		
		
		
		Collection<?>  c5= new ArrayList<Object>();
		Collection<?>  c6= new ArrayList<Animal>();
		Collection<?>  c7= new ArrayList<Cat>();
		Collection<?>  c8= new ArrayList<Dog>();
		
		//? extends E:
		//Collection <? extends animal> c9 = new ArrayList
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();
		
			
		Collection<? super Animal> c13 = new ArrayList<Object>();
		Collection<? super Animal> c14 = new ArrayList<Object>();
		
	}

}
class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}

