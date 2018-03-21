package cn.itcst_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午8:07:50 
* 类说明 
* 针对用户操作的几种的方式
*/
public interface UserDao {
	public abstract void add();
	public abstract void delete();
	public abstract void update();
	public abstract void find();

}
