/*
统计水仙花数 
分析：
水仙花数：一个三位数，其各位数的立方和等于该数本身
例如：153
153=1*1*1+5*5*5+3*3*3
B：定义一个人统计变量，默认的初始化值位0
C：for循环，然后获取每一位数的个位。十位。和百位
D：按照要求进行盘判断，然后计数


*/
class LoopTest4{
	public static void main(String[] args){
		//定义统计变量
		int count=0;
		//确定数据的范围
		for(int a=100;a<1000;a++){
	//获取数据各位的值
			int ge=a%10;
			int shi=(a/10)%10;
			int bai=(a/10/10)%10;
			// 根据水仙花的额定义进行判断
			if(a==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				//满足定义条件时，变量值加1
				count +=1;

			}
		}
		System.out.println("count:"+count);

		System.out.println("*************");
		//定义第二个变量
		int count2=0;
			//确定数的范围
		for(int b=1;b<=1000;b++){
				//根据要求确定判断条件
			if(b%3==2&&b%5==3&&b%7==2){
				count2 +=1;
				System.out.println(b);
			}
		}
		System.out.println("count2:"+count2);
	}
}