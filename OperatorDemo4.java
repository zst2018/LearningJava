/*
比较运算符

特点：无论你的操作是简单还是复杂，结果是boolean类型,即ture ,false

逻辑运算符（& | ^ ！ &&  ||）
特点：逻辑运算符一般用于连接Boolean类型的表达式或者值。
表达式：就是用运算符把常量或者变量连接起来的符合Java语法的式子
a+b(算术表达式) 
a==b（比较表达式）
逻辑与  
结论：有false则false
逻辑或
结论：有ture 则ture 
逻辑异或(情侣关系  )
结论：相同为false。不同为ture 
逻辑非
结论：非false 则ture 非ture 则false
特点： 偶数个不改变本身

*/
class OperatorDemo4{
	public static void main(String[] args){
		int x=3;
		int y=4;
		int z=3;
		System.out.println(x==y);
		System.out.println(x==z);
		System.out.println((x+y)==(x+z));

		System.out.println("*************");
		int a=19;
		int b=78;
		boolean flag=(a==b);
		//boolean flag=(a=b);   int 类型不能转换为boolean  类型
		System.out.println(flag);

		System.out.println("***************");

		int e=3;
		int f=4;
		int g=5;
		System.out.println(e>f & e>g);//false & false=false
		System.out.println(f>e & f>g);//ture & false=false
		System.out.println(g>e & g>f);//ture & ture =ture
		System.out.println(e>f && e>g);//false && false=false
		System.out.println(f>e && f>g);//ture && false=false
		System.out.println(g>e && g>f);//ture && ture=ture
		System.out.println("…………………………………………………………………………");


		int m=4;
		int n=8;
		boolean b1=(m++ == 4 & n++ ==8);
		boolean b2=(m++ == 4 && n++ ==8);
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		System.out.println(b1);
		System.out.println(b2);




	}
}