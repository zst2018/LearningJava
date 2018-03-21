package cn.itcast_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午3:25:10 
* 类说明 
*/
public class MyInvocationHandler implements InvocationHandler {

	private Object target;
	public MyInvocationHandler(Object target){
		this.target = target;
	}
	
		
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		 Object result = method.invoke(target, args);
		System.out.println("日志记录");
		
		
		return result;//返回的是代理对象
		
		
	}

}
