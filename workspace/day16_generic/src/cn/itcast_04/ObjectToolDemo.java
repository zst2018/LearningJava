package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午8:11:15 
* 类说明 
*/
public class ObjectToolDemo {
	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//		ot.setObj(new String("fangwing"));
//		String s = (String) ot.getObj();
//		System.out.println("xingisj:"+s);
//		
//		ot.setObj(new Integer(30));
//		Integer i = (Integer) ot.getObj();
//		System.out.println("jfioew:"+i);
//		
//		
//	//	ot.setObj(new String("hewi"));
////		Integer ii=(Integer)ot.getObj();
		
		
		ObjectTool<String> ot = new ObjectTool<String>();
		ot.setObj(new String("李星星"));
		String s = ot.getObj();
		System.out.println("姓名"+s);
		
		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(24));
		Integer i = ot2.getObj();
		System.out.println("年龄"+i);
		
	}

}
