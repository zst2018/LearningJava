package cn.itcast_03;

import java.util.HashSet;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午3:30:52 
* 类说明 
* hashSet 集合存储自定义对象并遍历，如果对象的成员变量值相同，即可视为同一个对象
* 注意L:
* 		使用hashSet集合，这个集合的底层是哈希表结构
* 		而哈希表结构的底层依赖，hashCode() 和equals 方法
* 		如果哟啊满足以上要求，需要重写这两个方法，自动生成即可
* 
*/
public class DogDemo {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<Dog> hs = new HashSet<Dog>();
		//创建狗对象
		Dog d1 = new Dog("秦桧",25,"红色",'男');
		Dog d2 = new Dog("高俅",23,"黑色",'女');
		Dog d3 = new Dog("秦桧",25,"红色",'男');
		Dog d4 = new Dog("秦桧",20,"红色",'女');
		Dog d5 = new Dog("魏忠贤",28,"白色",'男');
		Dog d6 = new Dog("李莲英",23,"黄色",'女');
		Dog d7 = new Dog("李莲英",23,"黄色",'女');
		
		//添加元素
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
	//遍历
		for(Dog d : hs){
			System.out.println(d.getName()+"---"+d.getAge()+"---"+d.getColor()+"---"+d.getSex());
		}
	}

}
