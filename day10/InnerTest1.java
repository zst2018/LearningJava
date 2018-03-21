/*
成员内部类的面试题
补齐程序（内部类和外部类没有继承关系）
要求输出恩分别为   30  20  10  

*/
class Outer{
	public int num=10;
	class Inner{
		public int num =20;
		public void show(){
			int num=30;
			System.out.println(num);
			System.out.println(this.num);
			//System.out.println( new Outer().num);// 
			//通过外部类名。限定this对象
			System.out.println(Outer.this.num);


		}
	}
}
class InnerTest1{
	public static void main(String[] args){ 

		Outer.Inner oi=new Outer().new Inner();
		oi.show();

	}
}