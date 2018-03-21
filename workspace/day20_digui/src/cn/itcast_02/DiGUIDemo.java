package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 上午9:50:11 
* 类说明 
* 需求：请用代码实现求5 阶的阶乘
* 
* 5！= 1*2*3*4*5
* 5！=5*4！
* 
* 循环实现
* 递归实现
* 	a 做递归要写一个方法
* 	b 出口条件
* 	c 规律
*/
public class DiGUIDemo {
	public static void main(String[] args) {
		int jc = 1 ;
		for(int x = 2 ;x<=5 ;x++){
			jc *= x;
		}
		System.out.println("5 的阶乘是："+jc);
		System.out.println(digui(5));
	}
	
	
	//递归
	//返回值类型   int
	//参数列表   int x 
	//出口条件   if（x = =1）return ;
	//规律： if(x > 0 && x != 1) return x*方法名（x-1）
	
	public static int digui(int x){
		
		if(x==1){
			return 1;
		}else {
			return x*digui(x-1);
			
		}
		

		
		
	}

}
