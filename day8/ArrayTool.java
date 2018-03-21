//工具类

class ArrayTool{
	private ArrayTool(){};
//遍历数组
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
//获取数组的最大值
	public static int max(int[] arr){
		 int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];

			}

		}
		return max;
	}
	//获取元素的索引值
	public static int getIndex(int[] arr,int value){
		
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(value==arr[i]){
				index=i;
				//如果此处不加break 程序会一直执行。直到value 值是数组中的值。返回索引值为止
				//break;
			}
		}
		return index;
	}
}




 





   