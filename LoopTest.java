/*
在控制台输出数据1-10
*/
class LoopTest{
	public static void main(String[] args){
		for(int x=1;x<=10;x++){
			System.out.println(x);
//************************定义的变量X只在for循环中有效***********************
		}
		System.out.println("***********************");
		for(int x=0;x<=9;x++){//此时判断条件语句要改为x<=9  或者x<10
			System.out.println(x+1);
		}
//在控制台输出数据10-1
System.out.println("*******************");
		for(int y=10;y>=1;y--){
			System.out.println(y);
		}
System.out.println("*******************");
// 初步测验
for(int y=10;y>=1;y--){
	int sum=0;//sun 变量的定义不能在for的循环体语句中，这样相当于每循环一次，sum的值都要初始化
	sum +=y;
	System.out.println("sum:"+sum); //输出语句最好也不要定义在循环体语句中，因为这样需要每循环一次都要输出一次
}

/*
需求：求出1~10 之间数据的和
分析：
	0+1=1
		1+2=3
			3+3=6
				6=4=10	
					。。。。
	需要定义两个变量：
	一个变量用于存储第一个加数，第一个加数其实保存的是以前的所有数据和，默认初始化值应该是0
	一个变量用来存储第二个数，第二个数其实是每次数据变化的值				

*/
	int sum=0;
	for(int x=1;x<=10;x++){
		sum +=x;
		System.out.println("sum:"+sum);//每进行一次加法运算，都有一个和的输出
	}
	System.out.println("sum:"+sum);//循环语句结束后，输出和的值   





	
	}


}
