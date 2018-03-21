
/*
class ArrayDemo{
	public static void main(String args[]){
		int[] arr={5,78,56,8,9};
		//遍历数组
		System.out.print("[");
		for( int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}

		}
		System.out.println();
	}

}
*/
/*
//改进  调用方法
class ArrayDemo{
	public static void main(String args[]){
		int[] arr={5,78,56,8,9};

			print(arr);
	}
	//假设该方法不是静态的，
	//public void print(int[] arr)   静态的方法不能在其上下文调用非静态的方法
	public static void print(int[] arr){
		System.out.print("[");
		for( int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}

		}
		System.out.println();
}
}
*/

/*
//改进用对象的方法
class Array{
	int[] arr;
	public static void print(int[] arr){
		System.out.print("[");
		for( int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}

		}
		System.out.println();
}

}
class ArrayDemo{
	public static void main(String[] args){
		int[] arr={5,78,59,9,8};
		Array a=new Array();
		a.print(arr);
	}
}
*/


import java.util.Scanner;

class ArrayDemo{
	public static void main(String args[]){
		int[] arr={8,48,75,9,7};
		ArrayTool.print(arr);
		int max1=ArrayTool.max(arr);
		System.out.println(max1);

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据：");
		 int value=sc.nextInt();
		int index1=ArrayTool.getIndex(arr,value);
		System.out.println(ArrayTool.getIndex(arr,value));
	}
}