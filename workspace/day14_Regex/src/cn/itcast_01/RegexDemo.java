package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午3:24:49 
* 类说明 
* 检验QQ 号码
* 1 要求碧玺是5~15的数字
* 2 0 不能开头
* 分析 
* 1 键盘录入一个qq号码
* 2 写一个功能实现椒盐
* 3 调用功能，输出结果
*/
import java.util.Scanner;
public class RegexDemo {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		System.out.println("checkQQ:"+checkQQ(qq));
		
	}
	// 写功能函数
	public static boolean checkQQ(String qq){
		boolean flag = true;
		//椒盐长度
		if(qq.length()>=5 && qq.length()<=15){
			//0 不能开头
			if(!qq.startsWith("0")){
				//必须是数字
				char[] chs = qq.toCharArray();
				for(int x = 0;x<chs.length;x++){
					char ch = chs[x];
					if(!Character.isDigit(ch)){
						flag = false;
						break;				
					}
				}
				
			}else {
				flag = false;
			}
		}else{
			flag = false;
		}
		return  flag;
	}

}
