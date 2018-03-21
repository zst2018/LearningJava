/*
对一个数组进行操作

*/

class Array3Demo{
	public static void main(String[] args){
		//创建数组
		int[] arr={34,23,5,765};
		/*
		//需求：遍历数组
		System.out.print("[ ");
		//遍历数组
		for(int i=0;i<arr.length;i++){
			//判断i是否是最后一个数组元素
			if(i==arr.length-1){
				System.out.print(arr[i]+" ]");
			}else{
				System.out.print(arr[i]+", ");
			}
		}
		//如果我有多个数组都要进行 遍历，那么代码的重复度就会很高
		//如何改进呢？用方法改进
*/
		//静态方法调用
		//printArry(arr);
		//非静态方法调用
		//Array3Demo ad=new Array3Demo();
		//ad.printArry(arr);

			//如果在ArrayTool类中，将构造方法私有（private）修饰。那么在测试类中就不能再创建对象了
		// 通过对象调用非静态的方法
		//ArrayTool at=new ArrayTool();
		//at.printArry(arr);

		//通过类名直接调用静态的方法
		ArrayTool.printArry(arr);

	}
	/*
	public static void printArry(int[] arr){
		for(int i=0;i<arr.length;i++){
			//判断i是否是最后一个数组元素
			if(i==arr.length-1){
				System.out.print(arr[i]+" ]");
			}else{
				System.out.print(arr[i]+", ");
			}

	}
}  
*/
//静态的main方法，不能调用非静态的方法
	
}