/*

变量什么时候定义为成员变量？
    		如果这个变量是用来描述这个类的信息的，那么该变量就应该定义为成员变量
    变量到底定义在哪里好？
    		变量的范围越小越好。因为能及时被回收
    		

*/ 
/* 

    	//方式1
 class Demo{
 	public int sum(){
 		int a=10;
 		int b=20;
 		int c=a+b;
 		return c;
 	}

 }
class Test{
	public static void main(String[] args){
		Demo d=new Demo();
		System.out.println(d.sum());
	}
}
//方式1  虽然能够满足题目的要求，但是并不是很好，因为参与运算的两个数的和是固定的


 */
/*
//方式2
class Demo{
	public int sum(int a,int b){
		int c=a+b;
		return c;
	}
}
class Test{
	public static void main(String[] args){
		Demo d=new Demo();
		int result=d.sum(89,67);
		System.out.println(result);

	}
}
*/
//方式3
class Demo{
	int a;
	int b;
	public int sum(){
		int c=a+b;
		return c;

	}
}
class Test{
	public static void main(String[] args){
		Demo d=new Demo();
		d.a=10;
		d.b=20;
		System.out.println(d.sum());
	}
}
//方法3并不是最好的，因为类是一些相关的属性和行为的集合，而成员变量是用来描述类的属性的
//很明显，Demo类的属性并不是变量a b.这个时候把参与运算 的两个变量定义为成员变量，并不合适
 
 