/*
数组（存储同一种数据类型的多个元素的容器）
格式：
数据类型[] 数组名
数据类型  数组名[]
初始化：
A 为数组开辟内存空间，并为每个数组元素赋值
静态初始化  
动态初始化




*/
class ArrayDemo{
	public static void main(String[] args){

		/*int[] a;
		System.out.println(a);如果直接输出，编译出问题，因为a 没有初始化
		*/

		int[] a=new int[8];
		int[] b=new int[7];
		System.out.println(a);
		System.out.println(b);//[I@15db9742    地址值   内存地址
		//我要地址值没有意义，如果要数据值，怎呢么办？
		//其实数组中的每个元素都是有编号的，并且从0开始，最大编号是数组的长度-1
		//用数组名个=和编号组合就可以获取数组中指定的编号元素，这个编号的抓也叫法就是    索引
		//通过数组名访问数据的格式是：     数组名[索引]
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		//动态数组中。初始化值就是默认的0；

		//给数组元素赋值，重新输出数组元素

		a[0]=100;
		a[1]=78;
		b[2]=45;
		b[0]=89;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

	}
}