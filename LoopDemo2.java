/*
while 循环
基本格式：
while（判断条件语句）{
	循环体语句；
}
扩展格式：
初始化化语句；
while（判断条件语句）{
	循环体语句；
	控制条件语句；
}
要求：输出helloworld十次


*/
class LoopDemo2{
	public static void main(String[] args){
		//用while循环实现
		int a=0;
		while(a<=9){
			System.out.println("helloworld");
			a++;

		}
		//用for循环实现
		for( int b=0;b<10;b++){
			System.out.println("helloworld");
		}
	}
}