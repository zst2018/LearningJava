package cn.itcast_08;

import java.util.concurrent.Callable;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午3:34:50 
* 类说明 
* Callable是带泛型的接口
* 这里指定的泛型其实是call（）方法的返回值类型
* 
*/
public class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		for(int x= 0 ;x<100;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
		return null;
	}

}
