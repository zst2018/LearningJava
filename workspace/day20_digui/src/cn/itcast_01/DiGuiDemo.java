package cn.itcast_01;

import javax.swing.plaf.synth.SynthScrollBarUI;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 上午9:20:32 
* 类说明 
* 递归：方法定义中调用方法本身的现象
* 方法的嵌套调用，不是递归
* Math.max(Math.max(a,b),c);
* public void show(){
* 	show();
* }
* 改进1
* public void show(int n){
* 	System.out.println(n);
* 	show(n);
* }
* 改进2
* public void show(int n){
* 	if(n<=0){
* 	System.exit(0);
* }
* 	System.out.println(n);
* 	show(n--);
* }
* 注意事项：
* 	A 递归一定要有出口，否则就是死递归(如改进1 ，2)
* 	B 递归的次数不能太多，否则就内存溢出
* 	C 构造方法不能递归使用
* 举例：
* 	A 从前有座山，山里有座庙。庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
* 		从前有座山，山里有座庙。庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
* 			从前有座山，山里有座庙。庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
* 				...
* 				庙没了
* 	
*/
public class DiGuiDemo {
	/*public DiGuiDemo(){
		//DiGuiDemo();
	}*/
	
	

}





