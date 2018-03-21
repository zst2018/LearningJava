package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午7:25:24 
* 类说明 
* 
* public BigInteger add(BigInteger val)       加
* public BigInteger subtract(BigInteger val)  减法
* public BigInteger multiply(BigInteger val)  乘法
* public BigInteger divide(BigInteger val)    除法
* public BigInteger[] divideAndRemainder(BigInteger val)  返回商和余数的数组
*
*/
import java.lang.Number;
import java.math.BigInteger;
public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");
		//public BigInteger add(BigInteger val); 加
		System.out.println("add:"+bi1.add(bi2));
		//public BigInteger subtract(BigInteger val);  减法
		System.out.println("subtract:"+bi1.subtract(bi2));
		//public BigInteger multiply(BigInteger val);  减法
		System.out.println("mutiply:"+bi1.multiply(bi2));
		//public BigInteger divide(BigInteger val);  减法
		System.out.println("divide:"+bi1.divide(bi2));
		
		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("商："+bis[0]);
		System.out.println("余数："+bis[1]);
		
		
	}
	

}
