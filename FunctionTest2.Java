/*
需求：在控制台输出如下的形状
*****
*****
*****
*****
明确：
参数列表       int n    int  m
返回值类型     在控制台输出，没有明确的返回值，不写又不行，所以，这里记住void
void 类型，返回值的而调用
三种调用方式：
单独调用    
输出调用(no )
赋值调用(no )

*/
class FunctionTest2{
	public static void main(String[] args){
		//int x=8;
		//int y=9;                                                                                                                                      
		//System.out.println(print(x,y));
		print(3,4);	//单独调用
		print(3,9);//单独调用
		//System.out.println(print(7,8));//输出调用，此处不允许使用空类型
			//赋值调用
		//void m=print(3,9);//非法的表示形式
	}
	public static void print(int n,int m){
		for(int a=1;a<=n;a++){
			for(int b=1;b<=m;b++){
				System.out.print("*");
			}
			System.out.println();
	}
	//return (n,m);  不正确      void 类型，返回值不明确，在控制台输出
}
}
