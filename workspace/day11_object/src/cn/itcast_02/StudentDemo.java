package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月24日 下午3:47:17 
* 类说明 
* public boolean equals(Object obj)
* 指示其他某个对象是否与此对象“相等”
* 
*/
public class StudentDemo {
	public static void main(String[] args){
		Student s1=new Student("林青霞",27);
		Student s2=new Student("林青霞",27);
		
		System.out.println(s1==s2);
		
	
	}

}
