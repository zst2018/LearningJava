package itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月22日 下午9:20:56 
* 类说明 
* String 的转换功能
*/
public class StringDemo {
	public static void main(String[] args){
		//定义一个字符串对象
		String s = "JavaSE";
		
		//byte[] getBytes();把字符串转换成字节数组
		byte[] bys = s.getBytes();
		for(int x = 0;x<bys.length;x++){
			System.out.println(bys[x]);
			
		}
		System.out.println("-----");
		
		//char[] toCharArray();
		char[] chs = s.toCharArray();
		for(int x = 0; x<chs.length;x++){
			System.out.println(chs[x]);
		}
		System.out.println();
		
		// static String valueOf(char[] chs) 把字符数组转成字符串
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println();
		
		// static String valueOf(int i):  把int类型的转化成字符串
		
		int i = 100;
		String sv = String.valueOf(i);
		System.out.println(sv);
		System.out.println();
		
		// String toLowerCase()  把字符串转成小写
		System.out.println("toLowerCase:"+s.toLowerCase());
		System.out.println("s:"+s);//本身没有改变
		System.out.println();
		
		//String toUperCase()  把字符串转成大写
		System.out.println("toUpperCase:"+s.toUpperCase());
		System.out.println();
		
		//String concat(String str): 把字符串拼接
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1+s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		
				
		
		
		
		
		
		
	}

}










