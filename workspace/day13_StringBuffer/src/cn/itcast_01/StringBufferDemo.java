package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月24日 下午3:00:27 
* 类说明 
* StringBuffer 类
* 与String类的不同
* 长度和内容可变
* 比String类更节省资源
* 冒泡排序
*/
public class StringBufferDemo {
	public static void main(String[] args){
		int[] arr ={24, 69, 80, 57, 13};
		System.out.println("排序前：");
		printArray(arr);
		System.out.println();
		bubbleSort(arr);
		System.out.println("排序后：");
		printArray(arr);
		
		
		//第一次比较
		/*
		for(int y = 0 ; y<arr.length-1; y++){
			//for(int x= 0; x<arr.length-1;x++){
				// x<arr.length-1-y是为了减少比较的次数
			for(int x = 0 ; x<arr.length-1-y ;x++){
				if(arr[x]>arr[x+1]){
					int temp = arr[x];
					arr[x]= arr[x+1];
					arr[x+1]= temp;
				}
			}
			//
			System.out.println("第"+(y+1)+"次比较后：");
			printArray(arr);
			System.out.println();
			//
		}
	*/
		
	// 由于可能需要多个数组需要排序，所以写成功能比较好	
/*
		for(int x= 0; x<arr.length-1;x++){
			if(arr[x]>arr[x+1]){
				int temp = arr[x];
				arr[x]= arr[x+1];
				arr[x+1]= temp;
			}
		}
		System.out.println("第一次比较后：");
		printArray(arr);
		System.out.println();
		
		
		//第二次计较
		for(int x= 0; x<arr.length-1;x++){
			if(arr[x]>arr[x+1]){
				int temp = arr[x];
				arr[x]= arr[x+1];
				arr[x+1]= temp;
			}
		}
		System.out.println("第二次比较后：");
		printArray(arr);
		System.out.println();
		
		//第三次比较后
		for(int x= 0; x<arr.length-1;x++){
			if(arr[x]>arr[x+1]){
				int temp = arr[x];
				arr[x]= arr[x+1];
				arr[x+1]= temp;
			}
		}
		System.out.println("第三次比较后：");
		printArray(arr);
		System.out.println();
		
		//第四次比较
		for(int x= 0; x<arr.length-1;x++){
			if(arr[x]>arr[x+1]){
				int temp = arr[x];
				arr[x]= arr[x+1];
				arr[x+1]= temp;
			}
		}
		System.out.println("第四次比较后：");
		printArray(arr);
		System.out.println();
		*/
	}
	//遍历功能
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.print(arr[x]);
			}else{
				System.out.print(arr[x]+", ");
			}
		}	
		System.out.print("]");
	}

	//排序功能
	public static void bubbleSort(int[] arr){
		for(int y = 0 ; y<arr.length-1; y++){
			//for(int x= 0; x<arr.length-1;x++){
				// x<arr.length-1-y是为了减少比较的次数
			for(int x = 0 ; x<arr.length-1-y ;x++){
				if(arr[x]>arr[x+1]){
					int temp = arr[x];
					arr[x]= arr[x+1];
					arr[x+1]= temp;
				}
			}
		}
		
	}
}
