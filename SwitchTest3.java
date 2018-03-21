 /*


 */
import java.util.Scanner;//导包
class SwitchTest3{
	public static void main(String[] args){
		
		//输出四个选项，然后供你选择
		//由于我们现在没有办法键盘录入得到一个‘A’，‘B’
		//字符的选项就用01 02 03 04 这样的字符代替
		//获取到这样的值以后，然后强制转换成字符类型
		System.out.println("请输入你认为最受欢迎的动物：");
		System.out.println(" 65 哈士奇");//65 在ASCII码中与其对应的是A
		System.out.println(" 66 龙猫");//66<--->B 
		System.out.println(" 67 仓鼠");//67<---->C
		System.out.println(" 68 考拉");//68<--->D
		//创建键盘录入的对象
		Scanner sc=new Scanner(System.in);
		int choiceNumber=sc.nextInt();
		char ch =(char) choiceNumber;//强制将int型转换位char
		switch(ch){
			case 'A':
			System.out.println("恭喜你，回答正确");
			break;
			case 'B':
			System.out.println("抱歉，回答错误");
			break;
			case 'C':
			System.out.println("抱歉，回答错误");
			break;
			case 'D':
			System.out.println("抱歉，回答错误");
			break;
			default:
			System.out.println("没有该选项");
			break ;
			



		}


	}
}