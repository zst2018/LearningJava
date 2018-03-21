/*
内部类的位置
成员位置：在成员位置的类，被称为成员内部类；
布局位置：在局部位置定义的类，被称为局部内部类



		
*/
class outer{
	private int num=10;
	//成员位置
	class Inner{

	}
	public void method(){
		class Inner2{

		}

	}
}
class InnerDemo2{
	public static void main(String[] args ){}
}