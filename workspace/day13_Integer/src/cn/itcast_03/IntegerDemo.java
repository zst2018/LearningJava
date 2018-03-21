package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午10:20:47 
* 类说明 
* int 类和String类的转换
* int--String
* String--int
*/
public class IntegerDemo {
	public static void main(String[] args){
		//int---String
		int number =100;
		String s1 = ""+number;
		System.out.println("s1:"+s1);
		//方式2
		String s2 = String.valueOf(number);
		System.out.println("s2:"+s2);
		//方式3
		//int ---integer---String 
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println("s3:"+s3);
		//fangshi 4 
		String s4 =Integer.toString(number);
		System.out.println("s4:"+s4);
		
	}

}
