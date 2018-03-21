package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午1:01:31 
* 类说明 
*/
public enum Direction3 {
	Front("前"){
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("前");
		}
	},
	Behind("后"){
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
	},
	Left("左"){
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
	},
	Right("右"){
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
	};
	//带参数表示
	
	
	private String name;
	private Direction3(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract void show();
}
