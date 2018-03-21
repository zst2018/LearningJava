package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午4:29:27 
* 类说明 
* 练习：
* 	用集合存储5 个学生对象，并把学生对象进行遍历
* 分析：
* 	A 创建学生类
* 	B创建集合对象
* 	C 创建学生对桑
* 	D 把学生对象添加到学生集合
* 	E 把集合转成数组
* 	F 遍历数组
* 
*/
import java.util.Collection;
import java.util.ArrayList;
public class StudentDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
	//创建学生对象
		Student s1 = new Student("林",27);
		Student s2 = new Student("风",30);
		Student s3 = new Student("零",33);
		Student s4 = new Student("无",35);
		Student s5 = new Student("赵",60);
		
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		// 把集合转成数组
		Object[] objs = c.toArray();
		//遍历数字
		for (int x = 0; x<objs.length;x++){
			//System.out.println(objs[x]);
			
			Student s = (Student)objs[x];
			System.out.println(s.getName()+"   "+s.getAge());
		}
	}

}











