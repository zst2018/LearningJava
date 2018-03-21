package cn.itcast_09;

import java.util.concurrent.Callable;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午3:46:50 
* 类说明 
* 线程求和案例
* 	
*/
public class MyCallable implements Callable<Integer> {
	private int number;
	public MyCallable(int number){
		this.number = number;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0 ;
		for(int x = 1;x<=number ; x++){
			sum += x;
		}
		return sum;
	}

}
