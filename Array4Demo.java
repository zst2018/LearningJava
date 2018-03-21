/*


*/
class Array4Demo{
	public static void main(String[] args){
		int[] arr={89,2,34,65,43};
		//数组遍历
		ArrayTool.printArry(arr);
		//空行
		System.out.println();
		//获取最大值
		int max=ArrayTool.getMax(arr);
		System.out.println(max);
		//获取最小值
		int min=ArrayTool.getMin(arr);
		System.out.println(min);
		//获取索引值
		int in=ArrayTool.getIndex(arr,78);
		System.out.println(in);
	}
}