package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午3:31:24 
* 类说明 
* Random 产生随机数的类
* 构造方法
* 	public Random();没有给种子，用的是默认种子，是当前时间的毫秒值
* 	public Random(loog seed);给出指定的种子
* 给定种子后，每次得到的随机数是相同的。
* 成员方法
* 	public int nextInt();返回的是int范围内的随机数
* 	public int nextInt(int n);返回的是 [0,n)的范围内的随机数
* 
* 
*/
import java.util.Random;
public class RandomDemo {
	public static void main(String[] args) {
		//创建对象是
		//Random r = new Random();//默认种子
		Random r = new Random(1111);
		for(int x = 0;x<10;x++ ){
			int num = r.nextInt();
			System.out.println(num);
			//生成 [0,100)的随机数
			int num1 = r.nextInt(100);
			System.out.println(num1);
		}
	}

}
