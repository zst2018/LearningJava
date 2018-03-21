/*

公司年销售求和：
某公司按照嫉妒和月份统计的数据如下：单位（万元）
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99



*/
class Array2Test2{
	public static void main(String[] args){
		//把题目的数据用二维数组来表示
		int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		//定义求和变量sum，初始化为0
		int sum=0;
		//遍历得到每一个二位数组的元素
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				//把元素累加求和
				sum +=arr[i][j];
			
				//System.out.println("sum="+sum);

			}
		}
		//最后输出sum
			System.out.println("sum="+sum+"万元");

	}
}