package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午1:38:07 
* 类说明 
* JDK  5 的新特性
* 自动装箱   把基本类型转换成包装类类型
* 自动拆箱   把包装类类型转换成基本类型
* 
*/
public class IntegerDemo {
	public static void main(String[] args) {
		//定义一个int 类型的包装类类型变量 i
		Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:"+ii);
		
		//通过反编译后的代码
		
		//Integer ii = Integer.valueOf(100);
		// ii = Integer.valueOf(ii.intValue()+200);
		//System.out.println((new StringBuilder("ii:)).append(ii).toString());
		
		
	}

}
