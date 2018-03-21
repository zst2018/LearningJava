package cn.itcast.test;

import java.lang.reflect.Field;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 上午11:17:51 
* 类说明 
*/
public class Tool {
	public void setProperty(Object obj,String propertyName,Object value) throws Exception{
		//根据对象获取字节码文件对象
		Class c=obj.getClass();
		
		//获取该独享的PropertyName成员bianl
		Field fields = c.getDeclaredField(propertyName);
		//取消访问检查
		fields.setAccessible(true);
		//给对象的成员变量赋值为指定的值
		fields.set(obj, value);
		
	}

}











