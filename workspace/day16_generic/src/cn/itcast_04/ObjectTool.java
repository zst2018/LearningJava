package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午8:07:35 
* 类说明 
* 泛型类
*/
public class ObjectTool<T> {
	private T obj;
	public T getObj(){
		return obj;
	}
	public void setObj(T obj){
		this.obj = obj;
	}

}
