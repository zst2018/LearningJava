package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午4:00:49 
* 类说明 
* 单例模式分为
* 	饿汉式：类一加载就创建对象
* 	懒汉式：用的时候，才去创建对象
*/
public class Teacher {
	private Teacher(){}
	private static Teacher t = null;
	
	public synchronized static Teacher getTeacher(){
		//return t;
		//t1,t2,t3线程
		if(t==null){
			//t1,t2,t3
			t = new Teacher();
		}
		return t;
	}

}








