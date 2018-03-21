//+ 运算符，做加法运算
//一般我们在运算时，要求参与运算的数据类型一致。
//boolean 类型不能转换成其他类型
//




class DateTypeDemo2{
	public static void main(String[] args){
		//直接输出的方式做加法
		//System.out.println(3+4);
		//两个int类型做加法
		int x=3;
		int y=4;
		int z=x+y;
		System.out.println(z);
		//定义一个Byte和一个int类型做加法
		byte m=4;
		int n=5;
		//直接输出（m+n）编译没有问题;
		//System.out.println(m+n);
		//直接p=m+n输出有问题，因为变量P没有数据类型
		 // p=m+n;
		// 因为9 理论上可以是byte ,short,int,long
		//byte  p=m+n ;int数据类型向byte类型转换时。会损失精度
		//m 是一个字节，n是四个字节，m+n参与运算时，m首先转换成四个字节再参与运算
		//int p=m+n;可以编译
		//short p=m+n; int 数据类型向short类型转换有可能丢失数据
		//long p=m+n;
		//定义为long 数据类型，可以编译
		//用强制类型转换改写
		byte p=(byte) (m+n);
  		System.out.println(p);
  		//
  		double e=23789.790;
  		//会损失精度
  		//float g=e;
  		//把double 赋值给float，强制转换
  		float g1=(float)e;
  		float g2=23789.790f;


	}
}