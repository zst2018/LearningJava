/*import java.util.Scanner;//导包
class InputDemo{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请你输入一个数据：");
		//通过对象获取数据
		int x=sc.nextInt();

		System.out.println("你输入的一个数据是："+x);
	}
}
*/
/*
practice:
   entering two datas through fingerboard,then work out the sum
   entering two datas through fingerboard ,then compare A with B ,and output the bigger one
*/
 /*
  import java.util.Scanner;//导包
  class InputDemo{
  	public static void main(String[] args){
  			Scanner sc=new Scanner(System.in);//创建键盘录入对象
  			System.out.println("请你输入第一个数据：");
  			int x=sc.nextInt();//通过对象获取数据
  			//Scanner sc=new Scanner(System.in);
  			System.out.println("请你输入第二个数据：");
  			int y=sc.nextInt();
  			int sum=(x+y);
  			System.out.println("sum:"+sum);
		}
  }
*/
  /*
  import java.util.Scanner;//导包
  class InputDemo{
  	public static void main(String[] args){
  		Scanner sc=new Scanner(System.in);//创建键盘录入对象
  		System.out.println("请你输入第一个数据：");
  		int x=sc.nextInt();//通过对象获取数据
  		System.out.println("请你输入第二个数据：");
  		int y=sc.nextInt();
  		int max=(x>y)?(x):(y);//比较两个数的大小
  		System.out.println("max:"+max);

  	}
  }
  */
  import java.util.Scanner;//导包
  class InputDemo{
  	public static void main(String[] args){
  		Scanner sc=new Scanner(System.in);//创建键盘录入对象
  		System.out.println("请你输入第一个数据：");
  		int x=sc.nextInt();//从对象获取数据
  		System.out.println("请你输入第二个数据：");
  		int y=sc.nextInt();
  		System.out.println("请你输入第三个数据：");
  		int z=sc.nextInt();
  		int max=(x>y)?((x>z)?(x):(z)):((y>z)?(y):(z));
  		System.out.println("max:"+max);
  		System.out.println("****************");
  		System.out.println("请你输入第一个数据：");
  		int a=sc.nextInt();
  		System.out.println("请你输入第二个数据：");
  		int b=sc.nextInt();
  		boolean flag=(a==b)?(true):(false);
  		System.out.println(flag);



  	}
  }

