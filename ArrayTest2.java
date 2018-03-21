/*
数组遍历：依次输出数组中的每一个元素

数组给我们提供了一个属性：length 专门用于获取数组的长度
格式：
		数组名.length          返回数组长度

*/
class ArrayTest2{
	public static void main(String[] args){
		int[] a={23,35,5,65};//静态初始化数组
		//获取每一个元素，我们知道数组名结合编号（索引）就可以找到数据
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		for(int x=0;x<4;x++){                        //x要从0开始
			System.out.println(a[x]);
		}
		int[] b={2,3,5,67,8,9,3,45,64,524,5,6,3,5,};
		int c=b.length;//获取数组b的长度，将值赋给c
		System.out.println(c);//在控制台输出数组b的长度
		System.out.println("***************");
		//for（int x=0;x<b.length;x++）     改进版
		for(int x=0;x<c;x++){
			System.out.println(b[x]);
		}


			bianLi(a);
            bianLi(b);
            bianLi2(a);
            bianLi2(b);


	}
/*
遍历数组的方法：
明确：
参数列表：int[] arr         数据类型[] 数组名
返回值：void 
问题：参数列表无法明确                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
 





*/

public static void bianLi(int[] c){
	for(int x=0;x<c.length;x++){
 		System.out.println(c[x]);
	}
}

//改进版
public static void bianLi2(int[] c){
	System.out.print("[");
	for(int x=0;x<c.length;x++){
		
		if(x==c.length-1){
			System.out.print(c[x]+"]");
		}else{
			System.out.print(c[x]+", ");
		}

	}
}
}