/*
匿名对象在开发中的使用
*/

interface Person{
	public abstract void study();

}

class PersonDemo{

	//接口类作为形式参数
	//这里需要的不是接口，而是接口实现类的对象
	public void method (Person p){
		p.study();
	}
}


//接口的实现类
class Student implements Person{
	//方法重写
	public void study(){
		System.out.println("nihao ");
	}
}

class InnerTest2{
	public static void main(String[] args){
		PersonDemo pd=new PersonDemo();
		//new Student() 
		pd.method(new Student());
		System.out.println();

		//匿名内部类在开发中的使用
		//匿名颞部类的本质是 继承类或者实现了接口的子类匿名对象
		pd.method(new Person(){
			public void study(){
				System.out.println("shiuetro");
			}

		}//此处不加分号              用完U即释放。不占内存，缺点，只能用一次
		);
		

	}
}