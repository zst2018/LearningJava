package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collections;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 上午11:29:14 
* 类说明 
* 模拟斗地主洗牌和发牌
* 分析：
* 	A创建一个牌盒
* 	B 装牌
* 	C 洗牌
* 	D 发牌
* 	E 看牌
* 	
*/
public class PokerDemo {
	public static void main(String[] args) {
		
		//创建一个牌盒
		ArrayList<String> array = new ArrayList<String>();
		
		//装牌
		//黑桃A，黑桃B。。。。黑桃K
		//红桃A。。
		//梅花A。。
		//方块A。。。
		//定义一个花色数组
		String[] colors = {"黑桃","红桃","梅花","方片"};
		//定义一个点数
		String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(String color:colors){
			for(String number: numbers){
				array.add(color.concat(number));				
			}
		}
		array.add("大王");
		array.add("小王");
		System.out.println("array:"+array);
		
		//洗牌
		Collections.shuffle(array);
		
		//System.out.println("array:"+array);
		
		//发牌
		ArrayList<String> fengqingyang = new ArrayList<String>();
		ArrayList<String> linqingxia = new ArrayList<String>();
		ArrayList<String> liuyi = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		
		for(int x =0; x<array.size();x++){
		    if(x>=array.size()-3){
		    	dipai.add(array.get(x));
		    	
		    }else if(x%3==0){
		    	fengqingyang.add(array.get(x));
				
			}else if(x%3==1){
				linqingxia.add(array.get(x));
				
			}else if(x % 3 ==2){
				liuyi.add(array.get(x));
			}
		}
		
		//看牌
		lookPoker("风清扬",fengqingyang);
		lookPoker("林青霞",linqingxia);
		lookPoker("刘意",liuyi);		
		lookPoker("底牌",dipai);
	}
	
	//看牌
	public static void lookPoker(String name,ArrayList<String> array){
		System.out.print(name+"的牌是：");
		for(String s : array){
			System.out.println(s+" ");
		}
		System.out.println();
		
	}

}
