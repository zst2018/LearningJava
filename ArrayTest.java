 /*
定义第一个数组，赋值，输出
定义第二个数组，赋值，输出
定义第三个数组，把第一个数组的地址值赋值给它。注意，类型要一致
通过第三个数组的名称，给元素重新赋值，最后输出第一个的数组名称和元素

栈内存的两个引用指向同一个堆内存空间，无论是他们谁的操作，都是指向同一个地方


 */

class ArrayTest{
	public static void main(String[] args){
		int[] a=new int[4];
		a[0]=9;
		a[1]=8;
		a[2]=67;
		a[3]=56;
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println();
		int[] b=new int[5];
		b[0]=1;
		b[1]=5;
		b[2]=45;
		b[3]=78;
		b[4]=96;
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println();
		int[] c=a;
		c[0]=7;
		c[1]=12;
		c[2]=45;
		c[3]=23;
		System.out.println(c);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println();
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);


	}

}