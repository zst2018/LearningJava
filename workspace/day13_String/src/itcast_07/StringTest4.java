package itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月23日 下午7:32:18 
* 类说明 
* 要求：统计大串中出现的小串的次数
* 在字符串 “hunjosermtgsakjhgoithlssfjhgkksekjltre”
* 
* se 出现了两次
* 分析：
* 	A 定义一个统计变量，初始化值为0
* 	B 先获取一次“java”在这个大串中出现的索引，
* 		如果索引值是-1 就说明不存在，返回统计变量
* 		如果索引值不是-1 ，就说明存在，统计变量++
* 	C 把刚才的索引，+ 小串的长度作为起始位置，截取原始大串，
* 		得到一个新的字符串，并把该字符串的重新赋值给大串。
* 	D 返回B即可。
* 	
*/
public class StringTest4 {
	public static void main(String[] args){
		//定义大串
		String maxString = "hunjosermtgsakjhgoithlssfjhgkksekjltre";
		//定义小串
		String minString = "se";
		//写功能实现
		int result = getCount(maxString,minString);
		System.out.println("Java 在大串中出现了几次："+result);
		
	}
	public static int getCount(String maxString,String minString){
		//定义一个统计变量，初始化值为0
		int count = 0;
		//先在大串中查找一次小串第一次出现的位置
		int index= maxString.indexOf(minString);
		// 索引不是-1 ，说明存在，统计变量++
		while(index !=-1){
			count ++;
			//把刚才的索引+小串的长度作为开始位置截取上一次的大串
			//返回一个新的字符串。并把该字符串的值重新赋值给大串
			
			int startIndex = index + minString.length();
			maxString=maxString.substring(startIndex);
			index = maxString.indexOf(minString);
		}
		return count;
	}

}
