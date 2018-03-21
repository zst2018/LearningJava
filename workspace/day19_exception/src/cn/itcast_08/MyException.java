package cn.itcast_08;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午2:01:51 
* 类说明 
* java中不可能对所有的情况都考虑到，所以，在实际开发中，我们需要自己定义异常
* 而我们自己随意写的一个类是不能作为异常类来看的，
* 要想你的类是一个异常类，就必须继承自Exception，或者RuntimeException
* 
* 两种方式
* 	A 继承Exception
*   B 继承RuntimeException
*   
*/
public class MyException extends Exception{
	public MyException(){
		super();
		
	}
	public MyException(String message){
		super(message);
	}
	
	
	

}

//public class MyException extends RuntimeException{
//	
//








