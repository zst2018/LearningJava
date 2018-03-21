/*
数组获取最大值（获取数组中的最大值和最小值）
分析：
A 定义一个数组，并对数组静态赋值
B 从数组中任意的找一个元素作为参照物（一般取第一个），默认他是最大值
C 然后遍历其他元素，依次和参照物进行对比，如果大的就留下，如果小就离开、
D 最后参照物保存的卆最大值

*/
class ArrayTest3{
	public static void main(String[] args){
		//定义一个数组
		int[] a={2,5,7,9};
		int max=a[0];
		//获取最大值
		for(int x=1;x<a.length;x++){
			if (max<=a[x]){
				max=a[x];

			}

		}
		System.out.println("最大值是："+max);
		//获取最小值
		int min=a[0];

		for(int x=1;x<a.length;x++){
			if(min>=a[x]){
				min=a[x];
			}
		}
		System.out.println("最小值是："+min);
		System.out.println("***************");
			System.out.println(max1(a));
			System.out.println(min1(a));

	}


	//最大值方法
	public static int max1(int[] arr){
		int max=arr[0];
		for(int x=1;x<arr.length;x++){
			if(max<=arr[x]){
				max=arr[x];
			}
		}
		return max;
	}
	//最小值方法
	public static int min1(int[] arr){
		int min=arr[0];
		for(int x=1;x<arr.length;x++){
			if(min>=arr[x]){
				min=arr[x];

			}
		}
		return min;
	}

}