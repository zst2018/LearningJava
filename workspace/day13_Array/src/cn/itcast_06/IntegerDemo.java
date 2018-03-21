package cn.itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午2:00:45 
* 类说明 
*/
public class IntegerDemo {
	public static void main(String[] args) {
		 Integer i1 =new Integer(127);
		 Integer i2 = new Integer(127);
		 System.out.println(i1==i2);
		 System.out.println(i1.equals(i2));
		 System.out.println();
		 
		 Integer i3 = new Integer(128);
		 Integer i4 = new Integer(128);
		 System.out.println(i3==i4);
		 System.out.println(i3.equals(i4));
		 System.out.println();
		 
		 
		 Integer i5= 128;  // 不在
		 Integer i6 =128;
		 System.out.println(i5==i6);
		 System.out.println(i5.equals(i6));
		 System.out.println();
		 
		 Integer i7= 127; //byte 范围内的值，在常量池中可以找到
		 Integer i8=127;
		 System.out.println(i7==i8);
		 System.out.println(i7.equals(i8));
		 System.out.println();
	}

}
