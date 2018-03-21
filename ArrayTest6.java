/*
数组元素查找（查找指定元素第一次在数组中出现的索引）
*/
import java.util.Scanner;
class ArrayTest6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int x=sc.nextInt();
		int[] a={3,4,6,8,2,6,9};
		System.out.println(index1(a,x));

	}
	//方法1
	public static int index(int[] arr,int value){

		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				return i;
			}

		}
		//当要查找的数据在数组中不存在，那就找不到，找不到，要有对应的返回，否则会报错
		//只要是判断，就与可能是false
		//如果找不到数据，我们返回一个负数即可，一般是返回-1
		return -1;
	}
	//方法2
	public static int index1(int[] arr,int value){
		//先定义一个索引值
		int i=-1;

		for(int j=0;j<arr.length;j++){
			//如果存在数据，就修改i的值
			if(arr[j]==value){
				i=j;

				break;
			}
		}
		//返回i;
		return i;
	}
}