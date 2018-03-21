/*
流程控制语句：可以控制程序的执行流程
分类：
顺序结构
选择结构
循环结构

*/
/*class ControlDemo{
public static void main(String[] args){
	System.out.println("程序开始了");
	System.out.println("你好");
	System.out.println("程序结束了");
}

}
*/
/*
选择结构：【if 语句】；
if语局的三种格式
第一种格式：
if（关系表达式）{
	语句体
}
执行流程
具体判断关系表达式看其结果是true还是false
如果是true就执行语句体
如果是false就不执行语句体

*/
/*
class ControlDemo{
	public static void main(String[] args){
		int x=20;
		if(x==20){

			System.out.println("x等于20");

        }
        if(x==78);//这条语句表示，if有语句体，只是语句体为空
         {
        	System.out.println("x等于78");//第二个if语句
        }//这个被作为独立的模块
        }
        System.out.println("over");//这条语句总会执行
	}
}

*/
class ControlDemo{
	public static void main(String[] args){
		int a=12;
		int b=234;
		if(a==b){
			System.out.println("a与b相等");
		}else{
			System.out.println("a与b不相等");
		}
		System.out.println("over");
	}
}