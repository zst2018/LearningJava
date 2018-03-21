class LoopTest8{
	public static void main(String[] args){
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		//System.out.println();//相当于空一行的作用
		//System.out.print("*")//不带换行的输出

		for(int a=0;a<4;a++){
			System.out.print("*");	
		}
		System.out.println();
		for(int a=0;a<4;a++){
			System.out.print("*");
		}
		System.out.println();
		for(int a=0;a<4;a++){
			System.out.print("*");
		}
		System.out.println();
		for( 

			  int a=0;a<4;a++){
			System.out.print("*");
		}
		System.out.println();
		for(int a=0;a<4;a++){
			System.out.print("*");
		}
		System.out.println();
		for(int a=1;a<=4;a++){
			for(int b=1;b<=5;b++){
				System.out.print("*");
			}
			System.out.println();
			//外循环控制行数，内循环控制列数
		}
		System.out.println();
		System.out.println();
		//输出正三角形
		//*       (第一行一列)【列数<=第I 数】
		//**       （第二行两列）
		//***       （第三行三列）
		//****        （第四行四列）
		//定义两个变量，一个表示行数，一个表示列数
		//外循环分别是A=1.2.3.4.
		//内循环分别是1    1，2     1，2 ，3     1,2,3,4
		//b=0,a=1,b<a成立，输出一个~ b++,然后b=1,b<a不成立，跳出for循环，然后换行
		//a++,a=2,a<4成立，循环体中，b=0,b<a,成立。输出一个~，然后b++,b=1.b<a同行再输出一个~ ，b++,b<a不成立，跳出循环，换行

		for(int a=1;a<=4;a++){
			for(int b=0;b<a;b++){
				System.out.print("~");//同行输出~
			
			}
			System.out.println();//换行
		}
		//输出九九乘法表
		//1*1=1
		//1*2=2 2*2=4
		//1*3=1 2*3=6 3*3=9
		//......
		//两个变量
		
		System.out.println();
		System.out.println();
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
				//System.out.print("a*"+"b="+a*b+" ");//输出格式
				//System.out.print(a+"*"+b+"="+(a*b)+" ");
				System.out.print(a+"*"+b+"="+(a*b)+"\t");
			}
			System.out.println();

		}

			//注意："\x",x表示任意，转移字符
		//‘\t’  tab 键的位置
		//‘\r’ 回车
		//'\n'   换行
	}
	
	

	
} 
