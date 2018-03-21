package cn.itcast_01;

import java.util.ArrayList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午1:22:09 
* 类说明 
* 集合的嵌套遍历
* 需求
* 	我们班有学生，每一个学生是不是一个对象，所以，使用一个集合表示一个班里的许文怀是哪个
* ArrayList<Student>
* 但是。，如果旁边还有另外一个班级，每一个班级也是一个ArrayList<Student>
* 而我现在有多个ArrayList<Student>也要用集合存储，怎么办呢？
* 就是这个样子ArrayList<ArayList<Student>>
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建大集合
		ArrayList<ArrayList<Student>> bigArray = new ArrayList<ArrayList<Student>>();
		//创建第一个班级的学生集合
		ArrayList<Student> firstArray=new ArrayList<Student>();
		Student s1=new Student("唐生",30);
		Student s2=new Student("孙悟空",29);
		Student s3=new Student("猪八戒",28);
		Student s4=new Student("杀生",27);
		Student s5=new Student("白龙马",26);
		//添加
		firstArray.add(s1);
		firstArray.add(s2);
		firstArray.add(s3);
		firstArray.add(s4);
		firstArray.add(s5);
		
		//
		bigArray.add(firstArray);
		
		ArrayList<Student> sedArray=new ArrayList<Student>();
		
		Student s11=new Student("诸葛亮",30);
		Student s22=new Student("周瑜",29);
		Student s33=new Student("司马懿",26);
		
		sedArray.add(s11);
		sedArray.add(s22);
		sedArray.add(s33);
		
		bigArray.add(sedArray);
		
		ArrayList<Student> thdArray=new ArrayList<Student>();
		
		Student s111=new Student("松江",40);
		Student s222=new Student("无用",35);
		Student s333=new Student("高俅",30);
		Student s444=new Student("李师师",22);
		
		thdArray.add(s111);
		thdArray.add(s222);
		thdArray.add(s333);
		thdArray.add(s444);
		
		bigArray.add(thdArray);
		
		//遍历
		for(ArrayList<Student> array : bigArray){
			for(Student s : array){
				System.out.println(s.getName()+"   "+s.getAge());
			}
		}
	}

}
