/*
do-while 格式
基本格式
do{
	循环体语句；
}while（判断条件语句）；
扩展格式
初始化语句；
do{
	循环体语句；
	控制条件语句；
}while（判断条件语句）；

*/
class LoopTest7{
	public static void main(String[] args){
		int a=1;
		do{
			System.out.println("hello");
			a++;
		}while(a<=10);

		//求和
		int b=1;
		int sum=0;
		do{
			sum +=b;
			b++;
		}while(b<=100);
		System.out.println("sum:"+sum);
		 
	}
}