package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午4:20:57 
* 类说明 
* 异常：程序出现了不正常的现象
* 举例：今天天气很好，班长出去旅游，骑着自行车，去山里面呼吸新鲜空气
* 		问题1 山路塌陷了，班长及时停车，过不去了，严重问题
* 		问题2  班长出门前，发现自行车没气了。 出发前就应该检查的问题
* 		问题3 班长骑着车在山路上，山路两边有小石子，中间是光滑的水泥路， ，一直在中间行驶是没有任何问题的
* 				但是，他偏偏喜欢骑在小石子上，结果爆胎了。
* 			这个问题是在运行过程中出现的问题。
* 程序的异常分类： Throwable
* 	1 严重问题，Error
* 			Error 是Throwable 的子类，是用于只是合理的应用程序不应该试图捕获的严重问题。
* 			针对这种问题，一般我们不处理，比如说  内存溢出。
* 	2 一般问题，Exception
* 		编译期问题  不是RuntimeException的异常
* 				这种问题是必须要处理的，因为，如果不处理，编译就不能通过。
* 		运行期问题  RuntimeException   
* 					这种问题我们也不处理，而且这种问题的出现
* 					一般都是我们的代码不够严禁，需要修正代码的。
* 如果程序出现了问题，我们没有左任何处理，最终JVM会做出默认的处理。
* 把异常的名称。原因及出现的问题等信息输出在控制台。
* 同时结束程序
* 处理问题的两种方式
* try{
* 	有可能有问题的代码;
* }catch(异常名 变量){
* 	针对问题的处理;
* }finally{
* 	释放资源;
* }
* 变形格式
*  try{
* 	有可能有问题的代码;
* }catch(异常名 变量){
* 	针对问题的处理;
* }
* 
*/
public class ExceptionDemo {
	public static void main(String[] args) {
		//第一阶段程序
		int a = 10;
		//int b = 2;
		int b = 0;//运行时异常
		try{
		System.out.println(a/b);
		//第二阶段程序
		}catch(ArithmeticException ae){
			System.out.println("除数不能是0");
			
		}
		System.out.println("over");	
	}

}
