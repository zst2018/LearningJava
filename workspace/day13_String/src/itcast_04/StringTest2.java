package itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月22日 下午4:42:27 
* 类说明 
*/
import java.util.Scanner;
public class StringTest2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String s = sc.nextLine();
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0 ;
		for(int x = 0;x<s.length();x++){
			char ch = s.charAt(x);
			if(ch>='a' && ch<='z'){
				smallCount++ ;
			}else if(ch>='A' && ch<= 'Z' ){
				bigCount ++ ;
			}else if (ch >=0 && ch <=9){
				numberCount++;
			}
		}
		
		System.out.println("bigCount:"+bigCount);
		System.out.println("numberCount:"+numberCount);
		System.out.println("smallCount:"+smallCount);
		
		
	}

}
