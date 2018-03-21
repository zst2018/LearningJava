/*
代码块
	局部代码块:局部位置，方法的定义中，用于限定变量的生命周期
	构造代码块：在类中的成员变量的位置,用{} 括起来，每次调用构造方法执行前，都会先执行构造代码块
				作用：可以把多个构造方法中的共同代码放在一起，对对象进行初始化

	静态代码块：在类中的成员位置，用{}括起来的代码，只不过它用static 修饰了，所以它在类被加载的时候就已经开始执行了
				特点：静态代码块，在程序中只执行一次
				作用：一般是对 类 进行初始化

			面试题：
					静态代码块：构造代码块，构造方法的执行顺序
					
							静态代码块   先于  构造代码块  先于  构造方法

					静态代码块  只执行一次
					构造代码块    每次调用构造方法都执行




*/
class Code{
	static{
		int a=989;
		System.out.println(a);
	}



	//构造代码块
	{
		int x=38;
	System.out.println(x);
	}
	/*int x=38;
	System.out.println(x);
	//CodeDemo.java:24: 错误: 需要<标识符>
      //  System.out.println(x);
*/


	static{
		int b=200;
		System.out.println(b);
	}

	//构造方法
	public Code(){
		System.out.println("code");
	}
	//构造方法
	public Code (int a){
		System.out.println("code1");
	}
	//静态代码块
	{
		int x=99;
	System.out.println(x);
	}

	/*
		E:\ZHANFSUTING\javacode>java CodeDemo
           10
              20
				38
					99
						code

	*/

}
class CodeDemo{
	public static void main(String[] args){
		//局部代码块   作用是  在局部位置  限定变量的生命周期。方便及早释放，提高内存利用率
		{
			int x=10;
		    System.out.println(x);
		}

		{
			int y=20;
		    System.out.println(y);
		}
		//找不到符号X
		//System.out.println(x); 
		/*
			E:\ZHANFSUTING\javacode>java CodeDemo
					10
					20
		*/


		//每调用构造方法执行前，就会首先执行一次代码块
		Code c=new Code();
			System.out.println("---------------");
		Code c1=new Code();
		System.out.println("************");
		//还有形式参数的的构造方法
		Code c2=new Code(1);
		/*
			
	E:\ZHANFSUTING\javacode>java CodeDemo
	10
	20
	38

		*/
	

	}
}