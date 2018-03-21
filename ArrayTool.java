/**
*这是一个针对数组操作的工具类
*@author 张    
*@version version 10.0
*/




public class ArrayTool {
		//把构造方法私有，外界就不能再创建对象了
	/**
	*这是一个私有构造
	* 
	*/
	    private ArrayTool(){};


		//public void printArry(int[] arr){
		//方法改进为静态后，就可以直接通过类名调用

		//遍历所有元素
	    /**
	    *这是遍历所有元素的方法  遍历后的格式是：[元素1，元素2....]
	    *@param arr     这是要被遍历的数组
	    *
	    */
		public static void printArry(int[] arr ){
			System.out.print("[ ");
		 



		   
		for(int i=0;i<arr.length;i++){
			//判断i是否是最后一个数组元素
			if(i==arr.length-1){
				System.out.print(arr[i]+" ]");
			}else{
				System.out.print(arr[i]+", ");
			}

		}
	} 

	//获取最大值的方法
	/**
	*这是获取最大值的方法
	*@param  arr   这是要获取最大值的数组
	*@return max
	*/
	public static int getMax(int[] arr){
		//int max=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>=max){
				max=arr[i];
			}
		}
				return max;
	}
	//获取最小值的方法
	/**
	*这是获取最小值的方法
	*@param  arr   这是要获取最小值的数组
	*@return min
	*/
	public static int getMin(int[] arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<=min){
				min = arr[i];
			}
		}
			return min ;
	}
	//获取索引的方法
	/**
	*这是获取指定元素的索引值的方法，如果找不到指定元素，久返回值为-1
	*@param  arr   要被查找的数组
	*@param  value   要查找的元素
	*@return    index 返回值
	*/
	public static int getIndex(int[] arr,int value){
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				index=i;
			}
		}
		return index;
	} 
}
