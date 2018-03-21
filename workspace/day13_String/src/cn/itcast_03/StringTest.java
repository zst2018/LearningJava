package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月16日 下午3:22:57 
* 类说明 
*模拟登录，给三次机会，并提示还有几次
*
*/
import java.util.Scanner;
public class StringTest {
	public static void main(String[] args){
		//已经存在的用户名
		String s2 = "zhangsuting";
		//创建键盘录入对像
		Scanner s1 = new Scanner(System.in);
		//Scanner s3 = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		
		//用户一共有三次输入用户名的机会
		for(int i=0 ;i<3;i++){
			
			String  name = s1.nextLine();
			//比较输入用户名是否正确
			if (name.equals(s2)){
				System.out.println("输入正确!");
				break;
				//如果输入正确，跳出循环结构，程序结束
			}else if(i!=2){
				System.out.println("输入不正确。您还有"+(2-i)+"次机会。"+"请重新输入：");
				
			}else if(i==2){
				System.out.println("您三次输入的用户名都不正确！");
			}
			
			
		}
		
		
	}
	

}
