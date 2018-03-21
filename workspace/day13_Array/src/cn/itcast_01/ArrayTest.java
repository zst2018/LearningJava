package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午7:13:14 
* 类说明 
* 举例：“dacgebf”
* 结果：“abcdefg”
* 分析：
* 	A 定义一个字符串
* 	B 把字符串转换为字符数组
* 	C 把字符数组进行排序
* 	D 把排序后的字符数组转环成字符串
* 	E 输出最后的字符串
*/
public class ArrayTest {
	public static void main(String[] args){
		//定义一个字符串
		String  s = "dacgebf";
		//把字符串转换为字符数组
		char[] chs = s.toCharArray();
		// 把字符数组进行排序
		bubbleSort(chs);
		//把排序后的字符数组转成字符串
		String result= String.valueOf(chs);
		System.out.println("result:"+result);
		
		
	}
	//冒泡排序
	public static void bubbleSort(char[] chs){
		for(int y = 0 ; y<chs.length;y++){
			for(int x = 0 ; x<chs.length-1-y;x++){
				if(chs[x]>chs[x+1]){
					char  temp;
					temp = chs[x];
					chs[x]=chs[x+1];
					chs[x+1]= temp;
					
				}
			}
		}
		System.out.println(chs);
	}

}
