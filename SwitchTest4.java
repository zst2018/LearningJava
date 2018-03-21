  /*根据你输入的字符串，判断是否满足要求的，如果有就输出
  否则提示有误
  String s=sc.nextLine();//从创建的对象中获取字符串
  */ 
  import java.util.Scanner;
  class SwitchTest4{
  	public static void main(String[] args){
  		Scanner sc=new Scanner(System.in);
  		System.out.println("请你输入字符串：");
  		String s=sc.nextLine();
  		switch(s){
  			case "hello":
  			System.out.println("你输入的是：hello");
  			break;
  			case "fuck":
  			System.out.println("你输入的是：fuck");
  			break;    
  			default :
  			System.out.println("你输入的不存在");
  			break;






  		} 
  	}
  }