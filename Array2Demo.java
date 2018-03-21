/*
二维数组：就是元素为一维数组的元素
格式1：	
	数据类型[][] 数组名=new 数据类型[m][n];
	m:二维数组有多少个一维数组
	n：表示每一个一维数组有多少个元素




注意：（以下两种也可以定义二维数组）
        数据类型  数组名[][] =new 数据类型[m][n];
		数据类型[] 数组名[] =new 数据类型[m][n];
举例：
	  int x,y ;   		定义两个整型变量
	  int[] x,y[]  ;   定义一个一维数组，一个二维数组
格式2：
	数据类型[][] 数组名=new 数据类型[m][]
	m表示二维数组有多少个一维数组
	列数没有给出，可以动态的定义


*/
	  class Array2Demo{
	  	public static void main(String[] args){
	  		//定义了一个二维数组arr 
	  		//这个二维数组有 3 个一维数组的元素
	  		//每个一维数组有  4  个元素
	  		int[][] arr=new int[3][4];
	  		System.out.println(arr);//	地址值
	  		System.out.println(arr[0][0]);//初始化元素
	  		System.out.println(arr[0]);//地址值
	  		int[][] arr1=new int[3][];
	  		System.out.println(arr1[0]);//null   因为每一个二维数组的元素，即一维数组还没有动态的分配。引用数据类型的默认初始化值是null
	  		System.out.println(arr1);//地址值
	  		//第一个数组元素有3个元素
	  		arr1[0]=new int[3];
	  		//第二个数组元素有2个元素
	  		arr1[1]=new int[2];
	  		//第三个数组元素有4个元素
	  		arr1[2]=new int[4];
	  		System.out.println(arr1[0]);//
	  		System.out.println(arr1[1][1]);
	  		//给二维数组的第二个数组元素的第一个数组赋值为89
	  		arr1[1][0]=89;
	  		System.out.println(arr1[1][0]); 




	  		int[][] b=new int[][]{{3,4},{4,7,8,},{54,78,8}};
	  		int[][] c={{5,87,5},{8,6,2}};


	  			  	}
	  }  


	   