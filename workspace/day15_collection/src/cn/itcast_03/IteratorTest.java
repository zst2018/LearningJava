package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午9:52:14 
* 类说明 
*注意L
*复制代码的时候，很容易把那个类所在的包也导入过来，很容易出现不能理解的问题
*
*/
import java.util.Collection;




import java.util.Iterator;

import java.util.ArrayList;
public class IteratorTest {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建学生对象‘
		Student s1 = new Student("林",27);
		Student s2 = new Student("风",30);
		Student s3 = new Student("零",33);
		Student s4 = new Student("无",35);
		Student s5 = new Student("赵",60);
		// 把学生添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//遍历
//		Iterator it =c.iterator();
//		while(it.hasNext()){
//			//System.out.println(it.next());
//			Student s = (Student) it.next();
//			System.out.println(s.getName()+"     "+s.getAge());
//		}
//		
	//for 循环改写  ,效率更高，因为for循环结束后，it 会被垃圾回收器回收，释放内存
		for(Iterator it = c.iterator();it.hasNext();){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"    "+s.getAge());
		}
		
	}

	
}
