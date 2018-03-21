package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午6:47:56 
* 类说明 
*/
public class EnumMethodDemo {
	public static void main(String[] args) {
		//int compareTo(E o)
		Direction2 d21= Direction2.Front;
		Direction2 d22= Direction2.Behind;
		Direction2 d23= Direction2.Left;
		Direction2 d24= Direction2.Right;
		System.out.println(d21.compareTo(d21)); //0
		System.out.println(d21.compareTo(d24)); //-3
		System.out.println(d24.compareTo(d21)); //3
		System.out.println(d21.compareTo(d24)); //-3
		// String name()
		System.out.println(d21.name());
		System.out.println(d22.name());
		//int ordinal()
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		//String toString()
		System.out.println(d21.toString());
		System.out.println(d22.toString());
		
		//<T> T valueOf(Class<T> type,String name)
	//在direction.class 的文件里拿一个值  front 
		
		Direction2 d = Enum.valueOf(Direction2.class,"Front");
		System.out.println(d.getName());
		
		
		//values()
		 Direction2[] dir = Direction2.values();
		 for(Direction2 d2 : dir){
			 System.out.println(d2);
			 System.out.println(d2.getName());
		 }
		
	}
	
	
}
