/*
方法重载



*/
class FunctionDemo2{
	public static void main(String[] args){
		
		System.out.println(sum(40,4));
		System.out.println(sum(40,4,56));
		System.out.println(sum(40,4,25,78));

	}
	public static int sum(int a,int b){
		return a+b;
	}
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	public static int sum(int a,int b,int c,int d){
		return a+b+c+d;
	}
}