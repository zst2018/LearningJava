package cn.itcast_08;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午2:11:16 
* 类说明 
*/
public class Teacher {
	//针对MyException 继承自RuntimeException 
	public void check(int score) throws MyException{
		if(score>100 || score<0){
			throw new MyException("分数必须在0~100之间");
		}else{
			System.out.println("分数没有问题");
		}
	}

}

	
	
	//正对MyException继承自RuntimeException 
//	public void check(int score) {
//		if(score>100 || score<0){
//			throw new MyException();
//		}else{
//			System.out.println("分数没有问题");
//		}
//	}
//}
