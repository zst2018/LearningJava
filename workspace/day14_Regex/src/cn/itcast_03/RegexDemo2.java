package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午6:50:33 
* 类说明 
* 分割功能练习
* 
*/
public class RegexDemo2 {
	public static void main(String[] args) {
		//定义一个字符串
		String s1 = "aa,bb,cc";
		//直接分割
		String[] strArray = s1.split(",");
		for(int x = 0; x<strArray.length;x++){
			System.out.println(strArray[x]);
			
		}
		System.out.println();
		
		String s2 = "aa.bb.cc";
		//直接分割
		String[] strArray2 = s2.split("\\.");// .的表示是\\.
		for(int x = 0; x<strArray2.length;x++){
			System.out.println(strArray2[x]);
			
		}
		System.out.println();
		
		String s3 = "aa bb cc";
		//直接分割
		String[] strArray3 = s1.split(" +");// 空格+  表示一次以上
		for(int x = 0; x<strArray3.length;x++){
			System.out.println(strArray3[x]);
			
		}
		System.out.println();
		
		//硬盘上的路径我们应嘎用\\代替\
		String s4 = "E:\\JavaSE\\day14\\avi";
		//直接分割
		String[] strArray4 = s4.split("\\\\");
		for(int x = 0; x<strArray4.length;x++){
			System.out.println(strArray4[x]);
			
		}
		System.out.println();
		
	}

}
