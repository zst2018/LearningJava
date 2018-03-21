package cn.itcst_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午8:11:06 
* 类说明 
* 问题：
* 	接口（方法比较多）---实现类（仅仅使用一个，也得把其他的实现给提供了。哪怕是空实现）
* 解决方案
* 	接口（方法比较多）---适配器类（实现接口，仅仅空实现）--实现类（用哪个实现哪个）
*/
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		
	}

}
