package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午2:40:04 
* 类说明 
*/
public class StudentDaoImpl2 implements StudentDao {

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		System.out.println("登录功能");
		System.out.println("日志记录");
	}

	@Override
	public void regist() {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		System.out.println("注册功能");
		System.out.println("日志记录");
	}

}
