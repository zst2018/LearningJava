/*

需求：比较两个数据是否相等，参数类型分别为
两个byte    两个short   两个int    两个 long 
并在main方法中进行测试

*/
class FunctionTest4{
	public static void main(String[] args){
		System.out.println(compare(2,6));
		System.out.println(compare(2,78));
		System.out.println(compare(78924,832748));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		int x=5;
		int y=5;
		System.out.println(compare(x,y));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		short n=5;
		short m=6;
		System.out.println(compare(n,m));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		byte c=9;
		byte d=8;
		System.out.println(compare(c,d));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		long e=890;
		long f=6898;
		System.out.println(compare(e,f));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");



	}
	public static boolean compare(int a,int b){
		System.out.println("int");
		return a==b;
	}
	public static boolean compare(short a,short b){
		System.out.println("short");
		return a==b;
	}
	public static boolean compare(byte a,byte b){
		System.out.println("byte");
		return a==b;
	}
	public static boolean compare(long a,long b){
		System.out.println("long");
		return a==b;
	}
}