package cn.itcast_02;
import java.util.Scanner;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午4:56:15 
* 类说明 
* 判断功能：校验邮箱
* 分析L
* 	键盘录入邮箱号码
* 	定义邮箱号码规则
*  1515678394@qq.com
*  zst@163.cong
*  ndjfew@126.com
*  udifdur@sina.com.cn
*  zst@itcast.cn
*  
* 	调用功能，判断即可
*   输出结果
*/
public class RegexTest {
	public static void main(String[] args) {
		//键盘录入邮箱
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();
		//定义邮箱的规则
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}\\.[a-zA-Z_0-9]{2,3}";
		//调用功能呢
		boolean flag = email.matches(regex);
		//输出结果
		System.out.println("flag:"+flag);
	}

}
