package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午3:03:41 
* 类说明 
*/
public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		//return null;
		return new Cat();
	}

}
