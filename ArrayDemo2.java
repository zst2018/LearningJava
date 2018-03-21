/*
静态初始化
格式：
数据类型[] 数组名=数据类型[]{元素1，元素2，。。。}
简化：
数据类型[] 数组名={元素1，元素2，。。。}；


*/
class ArrayDemo2{
	public static void main(String[] args){
		int[] a={1,3,6};
		int[] b= new int[]{4,65,546};
		System.out.println(a);//地址
		System.out.println(a[0]);// 1
		System.out.println(a[1]);// 3
		System.out.println(a[2]);// 6
		System.out.println(b);// 地址
		System.out.println(b[2]);// 546
	}
}