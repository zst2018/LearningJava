package itcast_01;
 /** 
 * @author 作者 E-mail: 
 * @version 创建时间：2018年1月13日 下午5:20:08 
 * 类说明 
 * 字符串，就是由多个字符组成的一串数据。也可以看成是一个字符数组
 * 通过API我们可以知道，
 * 		字符串字面值“ABC”也可以看成是一个字符串对象
 * 		字符串是常量。一旦被赋值，就不能被改变
 *  	构造方法
 *	   public String()  空构造
 * 	   public String(byte[] bytes) 把字节数组转成字符串
 *	   public String(byte[] bytes,int index,int length)
 *	    在这个数组中，从某个索引开始的几个几个元素变成字符串，即把字符数组的一部分转成字符串
 *	  public String(char[] value)把字符数组转成字符串
 *	   public String(char[] value,int index, int count)
 *		把字符数组的一部分转成字符串
 * 	   public String(String original)把字符串常量值转成字符串
 *     字符串的方法
 * 	public int length（） 返回此字符串的长度
 */
public class StringDemo {
	public static void main(String[] args){
		String s1 = new String();
		System.out.println("s1:"+s1);
		//输出该对象，其本质是调用该对象的tostring 方法
	   //tostring 方法  类名+@+地址的哈希码值表示  
		System.out.println(s1.length());
		System.out.println("~~~~~~~~~");
		
		// public String(byte[] bytes);把字节数组转成字符串
		byte[] bys = {97, 98, 99, 100, 88};
		String s2 = new String(bys);
		System.out.println("s2:"+s2);
		System.out.println("s2.length():"+s2.length());
		System.out.println("~~~~~");
		
		String s3 = new String(bys ,1 ,3);
		System.out.println("s3:"+s3);
		System.out.println("s3.length():"+s3.length());
		System.out.println("~~~~~~~");
		
		
		char[] chs = {'a','b','c','d','我'};
		String s4 = new String(chs);
		System.out.println("s4:"+s4);
		System.out.println("s4.length():"+s4.length());
		System.out.println("~~~~~~~~~~~");
		
		String s5 = new String(chs, 1, 3);
		System.out.println("s5:"+s5);
		System.out.println("s5.length():"+s5.length());
		System.out.println("~~~~~~~");
		
		String s6 = new String("abcde");
		System.out.println("s6:"+s6);
		System.out.println("s6.length():"+s6.length());
		System.out.println("~~~~~");
		
		String s7 = "abcde";
		System.out.println("s7:"+s7);
		System.out.println("s7.length():"+s7.length());
		
		
				
		
	}

}











