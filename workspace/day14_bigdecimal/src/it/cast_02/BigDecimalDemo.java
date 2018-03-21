package it.cast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午8:30:30 
* 类说明 
*/
import java.math.BigDecimal;
public class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:"+bd1.add(bd2));
		System.out.println();
		
		//public BigDecimal subtract(BigDecimal subtrahend);
		
		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:"+bd3.subtract(bd4));
		
		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:"+bd5.multiply(bd6));
		
		
		
	}

}
