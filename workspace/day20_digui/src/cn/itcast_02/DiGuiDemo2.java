package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 上午10:37:15 
* 类说明 
* 有一对兔子，从出生后3 个月起每月都生一对兔子，
* 	小兔子长到第三个月后，又生一对兔子，假如兔子都不死，问第二十个月的兔子对数是多少？
* 第1个月  1
* 第2个月 1
* 第3个月 2
* 第4个月 3
* 第5个月 5
* 第6个月 8
* ...
* 规律   第N个月的兔子个数    第N-1  + 第 N-2 ,从第3 个月开始
* 实现方式
* 	A数组实现
* 	B变量的变化实现
* 加入相邻的两个月的兔子对数是 a b 
* 第一个相邻的数据  a=1,b=1
* 第二个相邻的数据a=1 b=2
* 第三个相邻的数据a=2 b=3
* ...
* 下一次的a 是以前的b  下一个的b  是以前的 a+b 
*/
public class DiGuiDemo2 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		//arr[2]=arr[0]+arr[1];
		for(int x = 2 ;x<arr.length;x++){
			arr[x]=arr[x-1]+arr[x-2];
		}
		System.out.println(arr[19]);//6765
		
		
		
		int a=1;
		int b = 1;
		for(int x = 0 ;x<18;x++){
			int temp = a ;
			a = b;
			b = temp+b;
		}
		System.out.println(b);
		System.out.println(digui(20));
		
	}
	
	
	
	/*
	 * 方法 
	 * 	返回值；类型   int
	 * 	参数列表    int n 
	 * 出口条件
	 * 	第一个月是1    第二个月是 2 
	 * 规律
	 * 	从第三个月开始，每个月是前两个月之和
	 * 
	 * */
	public static int digui(int n){
		
		if(n==1 || n ==2){
			return 1;
		}else{
			return digui(n-1)+digui(n-2);
		}
		
	}

}
