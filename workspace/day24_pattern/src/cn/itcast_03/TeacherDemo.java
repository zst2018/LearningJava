package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午4:05:55 
* 类说明 
*/
public class TeacherDemo {
	public static void main(String[] args) {
		
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		
		System.out.println(t1==t2);//true
		System.out.println(t1);
		//cn.itcast_03.Teacher@15db9742
		System.out.println(t2);
	}
	

}
