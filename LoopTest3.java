/* 

需求;在控制台输出水仙花数
水仙花数，首先是三位数，水仙花数=百位数^3+十位数^3+个位数^3
分析：假设有一个三位数X
个位数的获取：  X % 10=个位数
十位数的获取： （X / 10）% 10=十位数
百位数的获取： （x/10/10）% 10 =百位数
同理。千位数，其他位数的的获取以此类推


*/
class LoopTest3{
	public static void main(String[] args){
		for( int x=100;x<=1000;x++){
			int ge=x%10;
			int shi=(x/10)%10;
			int bai=(x/10/10)%10;
			//if(x==ge^3+shi^3+bai^3)(编译错误)[^ 运算符是按位异或，不是幂乘]
			if(x==ge*ge*ge+shi*shi*shi+bai*bai*bai){
				System.out.println("水仙花数是："+x);
			}
		}
		int y=6; 
		int x=3;
		int z=x^y;
		System.out.println(z);
		/*
		练习：在控制台输出满足如下条件的五位数
		个位等于万位
		十位等于千位
		个位+十位+千位+万位=百位

		*/
		for(int a=10000;a<100000;a++){
			int ge=a%10;
			int shi=(a/10)%10;
			int bai=(a/10/10)%10;
			int qian=(a/10/10/10)%10;
			int wan=(a/10/10/10/10)%10;
			if(ge==wan&&shi==qian&&(ge+shi+qian+wan==bai)){
				System.out.println("a:"+a);
			}
		}
	}
}
