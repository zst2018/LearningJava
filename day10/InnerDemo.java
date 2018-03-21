/*

*/
class Outer{
	private int num=10;
	//定义内部类
	class Inner{
		public void show(){
			System.out.println(num);
		}

	}
	public void method(){
		Inner i=new Inner();
		i.show();//错误: 找不到符号
	}
}
class InnerDemo{
	public static void main(String[] args){

	}
}