package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午12:55:06 
* 类说明 
*/
public enum Direction2 {
	Front("前"),Behind("后"),Left("左"),Right("右");
	//带参数表示
	
	
	private String name;
	private Direction2(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hello";
	}

}
