package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月13日 上午11:30:24 
* 类说明 
* 常用的两个方法
* 	public int nextInt(); 获取一个int类型的值
* 	public String nextLine(); 获取一个String类型的值
* 
* 出现问题
* 	先获取一个数值，再获取一个字符串，会出现问题
* 主要原因是因为换行符号
* 解决方法：
* A 先获取一个数值后，再创建一个新的键盘录入对象获取字符创串
* B 把所有的数据都按照字符串获取，然后要什么就对应的转化为什么
* 
* 
* 
* enter  是/n
* 
* 
*/
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		/*
		//获取两个int类型的值
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a:"+a+"    "+"b:"+b);
		*/
		
		/*
		//获取两个string类型的值
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1:"+s1+", s2:"+s2);
		
		//先获取一个字符串，再获取一个int值
		String c1=sc.nextLine();
		int c2 = sc.nextInt();
		System.out.println("c1:"+c1+", c2:"+c2);
		*/
		// 先获取一个int值，再获取一个字符串
		int d1 = sc.nextInt();
		
		String d2 = sc.nextLine();
		System.out.println("d1:"+d1+", d2:"+d2);
		
		// 解决方法
		int e1 = sc.nextInt();
		
		//重新创建一个对象，是为了和数值获取的扫描器，不同的对象是不同的扫面器
		
		Scanner sc2 = new Scanner(System.in);
		String e2 = sc2.nextLine();
		System.out.println("e1:"+e1+",e2: "+e2);
		
		
		
		
	}

}
