
/*
二维数组的遍历


*/
class Array2Test{
	public static void main(String[] args){
		int[][] arr={{3,5,7},{5,84,23},{5,8,0,3,1}};
		//谁来代表{3,5,7}
		//arr[0]就是第一个数组
		//arr[0]={3,5,7}
		for(int i=0;i<arr[0].length;i++){
			System.out.println(arr[0][i]);
		}
		System.out.println("**************");
		for(int j=0;j<arr[1].length;j++){
			System.out.println(arr[1][j]);
		}
		System.out.println("~~~~~~~~~~~~~~~~");
		for(int k=0;k<arr[2].length;k++){
			System.out.println(arr[2][k]);
		}
		System.out.println("~~~~~~~~~~~~~~~~");
		//用循环改进
		for(int m=0;m<arr.length;m++){
			for(int n=0;n<arr[m].length;n++){
				System.out.println(arr[m][n]);
			
			}
				System.out.println("--------------------");
		}
		System.out.println("+++++++++");
		print(arr);
	}
	//用方法改进      返回值：void   参数列表     int[][] arr
	//外循环控制的是二维数组的长度，即是一维数组的个数，内循环是一维数组中元素的个数
    public static void print(int[][] arr){
    	for(int m=0;m<arr.length;m++){
			for(int n=0;n<arr[m].length;n++){
				System.out.println(arr[m][n]);
			
			}
				System.out.println("--------------------");
		}

    }
}