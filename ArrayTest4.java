  /*
  数组逆序




*/   
class ArrayTest4{
	public static void main(String[] args){
		//	定义一个数组，静态初始化
		int[] a={34,4,677,8,54,2};
		int[] b=new int[a.length];		
		//reverse(a);
		reverse1(a,b);
		print1(b);
		//逆序，用循环实现
		//索引从0 开始，索引值小于整个的一半，除2取整
/*		for(int x=0;x<a.length/2;x++){
			//循环从x=0，开始，首先将a[0]，赋值给temp ，然后将a[a.length-1]的值赋给a[0],最后将temp 的值赋给a[a.length-1]
			//因为x<a.length/2,所以x++.  x=1时，a[1]的值赋给temp。将a[a.length-1-1]的值赋给a[1],最后将temp 的值赋给a[a.length-1-1]
			int temp=a[x];
		
			a[x]=a[a.length-1-x];
			
			a[a.length-1-x]=temp;
		}
		//遍历数组
		System.out.print("[");//for循环开始前，先在一行输出“【”
		for(int x=0;x<=a.length-1;x++){
			//判断索引值，是不是最后一个元素
			if(x==a.length-1){
			//如果是最后一个元素，就输出元素和“】”
			System.out.print(a[x]+"]");
			}else{
				//如果不是最后一个元素，就输出元素和逗号，空格

				System.out.print(a[x]+", ");
			}

		}
*/


	}
								//用方法实现
//逆序方法
	public static void reverse(int[] arr){
		for(int x=0;x<arr.length/2;x++){
			//循环从x=0，开始，首先将arr[0]，赋值给temp ，然后将arr[arr.length-1]的值赋给arr[0],最后将temp 的值赋给a[a.length-1]
			//因为x<arr.length/2,所以x++.  x=1时，a[1]的值赋给temp。将arr[arr.length-1-1]的值赋给a[1],最后将temp 的值赋给a[a.length-1-1]
			int temp=arr[x];
		
			arr[x]=arr[arr.length-1-x];
			
			arr[arr.length-1-x]=temp;

	}
}
//逆序方法
	public static void reverse1(int[] a,int[] b){
		
		for(int i=0;i<a.length;i++){
			b[a.length-1-i]=a[i];
			
		}
	}
//遍历方法
	public static void print1(int[] ar){
		System.out.print("[");//for循环开始前，先在一行输出“【”
		for(int x=0;x<=ar.length-1;x++){
			//判断索引值，是不是最后一个元素
			if(x==ar.length-1){
			//如果是最后一个元素，就输出元素和“】”
			System.out.print(ar[x]+"]");
			}else{
				//如果不是最后一个元素，就输出元素和逗号，空格

				System.out.print(ar[x]+", ");
	}
}
   }
   }   