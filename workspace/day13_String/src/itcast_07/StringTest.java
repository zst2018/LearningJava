package itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月23日 下午4:43:24 
* 类说明 
* 要求：把数组中的数据按照指定的格式拼接成一个字符串
* 	int[] arr= {1,2,3}
* 输出结果
* 	“[1, 2, 3]” 
* 分析
* A 定义一个字符串对象，内容为空
* B 先把字符串拼接一个“【”
* C 遍历int数组，得到每一个元素
* D 先判断该元素是否是最后一个，
*   是，就直接拼接元素和“】”
*   不是，就拼接元素和逗号以及空格
*   E  输出拼接后的字符串
*   
* 	
* 	
*/
public class StringTest {
	public static void main(String[] args){
		//已经存在的数组
		int[] arr={1,2,3};
		
		//定义一个字符串对象
		String s = "";
		
		//先把字符串拼接一个“[”
		s+="[";
		//遍历int数组，得到每一个元素
		for(int x = 0; x<arr.length;x++){
			//判断元素是否是最后一个
			if(x==arr.length-1){
				s+=arr[x];
				s+="]";
			}else{
				s+=arr[x];
				s+=", ";
				
			}
		}
		//输出最终的字符串是
		System.out.println("s:"+s);
	}

}
