/*
main 方法是静态的
		public static void mian(String[] args)
		public 公共的，访问权限是最大的，由于main方法是被JVM调用，所以访问权限要足够大，
		static 静态的，不需要创建对象，通过了类名就可以，方便被JVM调用
		void 因为我们曾经说过，方法的返回值是返回给调用者的，
				而main方法是被JVM调用，不需要给JVM 返回值
		main 是一个常见的方法入口，一个通用的名称，虽然不是关键字，但是被JVM识别
					几乎所有语言都是以main作为入口
		String[] args 这是一个字符串数组，值呢？
						以前用于接受键盘录入的
						格式是： 
							java MainDemo hello world java 

*/
class MainDemo{
	public static void main(String[] args){
	//	System.out.println(args);//地址值
	//	System.out.println(args.length);//0
	//	System.out.println(args[0]);//越界

			//注意：在控制台输入格式：java MainDemo hello world java

		//接收数据后
		System.out.println(args);  

		System.out.println(args.length);
		//System.out.println(args[0]);
			for (int x=0;x<args.length;x++){
				System.out.println(args[x]);
			}



	}
} 
 










           