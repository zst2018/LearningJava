package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午7:58:26 
* 类说明 
*/
public abstract class PhoneDecorate implements Phone {
	private Phone p ;
	public PhoneDecorate(Phone p ){
		this.p = p;
	} 
	
	
	
	
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
			this.p.call();
			
			
	}

}
