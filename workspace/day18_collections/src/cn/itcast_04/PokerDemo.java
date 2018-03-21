package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午2:05:05 
* 类说明 
* 思路
* 	A创建一个HashMap集合
* 	B 创建一个ArrayList集合
* 	C 创建花色数组和点数数组
* 	D 从0 开始往HashMaP里面存储编号，biang存储相应的牌
* 		同时往ArrayList里面存储编号即可
* 	E 洗牌（洗的是编号）-
* 	F 发牌（发的也是编号，为了保证编号是排序，就创建了TreeSet集合接受）
* 	G 看牌  （遍历TReeSet集合，获取编号，到HashMap 集合找对应的牌）
*/
public class PokerDemo {
	public static void main(String[] args) {
		//创建一个HashMap 集合
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//创建一个ArrayList集合
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//定义一个花色数组
		String[] colors = {"黑桃","红桃","梅花","方片"};
		//定义一个点数
		String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		//从0 开始往HashMap里面存储编号，并存储对应的牌，同时往ArrayList里面存储编号即可
		int index= 0 ;
		
		for(String number: numbers){
			for(String color:colors){
				String poker = color.concat(number);
				
				hm.put(index,poker);
				array.add(index);
				index++;
			}
		}
		
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);
		
		//洗牌
		Collections.shuffle(array);
		
		//发牌（发的也是编号，为了保证编号是顺序的，就穿件了TreeSet集合接受）
		TreeSet<Integer> fengqingyang = new TreeSet<Integer>();
		TreeSet<Integer> linqingxia = new TreeSet<Integer>();
		TreeSet<Integer> liuyi = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
		
		
		for(int x = 0 ; x<array.size();x++){
			if(x>=array.size()-3){
				dipai.add(array.get(x));
			}else if(x % 3 ==0){
				fengqingyang.add(array.get(x));
			}else if(x % 3 ==1){
				linqingxia.add(array.get(x));
			}else if (x % 3 ==2){
				liuyi.add(array.get(x));
			}
		}
		
		
		//看牌
		lookPoker("风清扬",fengqingyang,hm);
		lookPoker("林青霞",linqingxia,hm);
		lookPoker("刘意",liuyi,hm);
		lookPoker("底牌",dipai,hm);
			 
		
	}
	//看牌
	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
		System.out.println(name+"的牌是：");
		for(Integer key:ts){
			String value = hm.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}

}
















