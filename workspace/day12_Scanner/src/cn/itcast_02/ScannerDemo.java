package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月13日 上午11:10:30 
* 类说明 
* 基本格式：
* 	public boolean hasNextXxx();判断是否是某种类型的元素
* 	public Xxx  nextXxx();获取该元素
* 	举例：用int 类型的方法举例
* 	public Boolean hasNextInt()
* 	punlic int nextInt()
* 
* 注意：
* InputMismatchException   输入的东西不匹配
* 
* 
* 
*/
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()){
		// 获取数据
			int x = sc.nextInt();
			System.out.println("x:"+x);
		
		}else{
			System.out.println("你输入的不是int类型的数据");
		}
	}

}













