/*

练习：
求出1~100 的和
统计水仙花的数


*/
class LoopTest5{
	public static void main(String[] args){
		//使用while循环实现求和
		int a=1;//定义变量，初始化值位1
		int sum=0;//定义变量，初始化值位0
		while(a<=100){
			sum += a;//表达式左边的值加上表达式右边的值，运算后结果赋给左边的便利分
			a++;//变量值加1，如果没有控制条件语句，可能会陷入死循环

		}
		System.out.println("sum:"+sum);
		System.out.println("**********");
		//统计数量
		int b=100;//定义变量，初始化值位100
		int count=0;//定义统计变量，初始化值位0
		while(b<1000){
			int ge =b%10;//获取个位数
			int shi =(b/10)%10;//获取十位数
			int bai =(b/10/10)%10;//获取百位数
			//根据要求，确定判断条件语句
			if(b==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				count++;//统计变量的值加1
			}
			b++;//变量的值加1
		}
		System.out.println("count:"+count);
	}
}