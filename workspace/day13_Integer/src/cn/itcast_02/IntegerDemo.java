package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午10:14:45 
* 类说明 
* Integer 的构造方法
* public Integer(int value)
* public Integer(String s)
* 
*/
public class IntegerDemo {
	public static void main(String[] args){
		//方式1
		int i =100;
		Integer ii = new Integer(i);
		System.out.println("ii:"+ii);
		
		//方式2
		String s = "100";
		//NumberFormatException.
		//String s1 = "dse";
		Integer iii=new Integer(s);
		System.out.println("iii:"+iii);
		
	}

}
