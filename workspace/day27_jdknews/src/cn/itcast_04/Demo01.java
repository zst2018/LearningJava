package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午8:19:55 
* 类说明 
*/
public class Demo01 {
	public static void main(String[] args) {
		Inter i= new InterImplements();
		i.show();
		i.defaultPrint();
		
		Inter.staticPrint();
		//Inter.defaultPrint()非静态方法不能直接使用
		
		
		
	}

}
