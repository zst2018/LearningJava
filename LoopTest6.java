/*
统计思想
折叠一个珠穆朗玛峰
为了方便，可以把0.01转换为1，同时8848 转换为884800.都为int类型


*/
class LoopTest6{
	public static void main(String[] args){
		double  a=0.01;//变量a的数据类型要定义为double

		int count=0;
		while(a<=8848){
			count++;
			a *=2;//每折叠一次，厚度为之前的2 倍
			System.out.println(a);
		}
		System.out.println("count:"+count);
		System.out.println("******************");
		int count1=0;
		for( double b=0.01;b<=8848;b *=2){
			count1++;
			System.out.println(b);
		}
		System.out.println("count1:"+count1);
	}
}