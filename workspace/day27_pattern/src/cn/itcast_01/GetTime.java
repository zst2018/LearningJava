package cn.itcast_01;



/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午4:00:59 
* 类说明 
*需求：计算出一段代码的运行时间
*/
public abstract class GetTime {
	public long getTime() {
		long start = System.currentTimeMillis();
		//for循环
//		for(int x = 0 ;x<10000;x++){
//			System.out.println(x);
//		}
		
		//视频的时间
//		try{
//			BufferedInputStream bis = new BufferedInputStream(
//					new FileInputStream("a.avi"));
//			BufferedOutputStream bos = new BufferedOutputStream(
//					new FileOutputStream("b.avi"));
//			
//			byte[] bys = new byte[1024];
//			int len = 0 ;
//			while((len = bis.read(bys)) != -1){
//				bos.write(bys,0,len);
//			}
//			bos.close();
//			bis.close();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
		
		//如果需要测试不同的代码，如集合操作的，多线程操作的，常用API操作等
		//每次改变中间的代码，违背的开闭原则，即扩展开放，修改关闭
		
		code();
		
		
		long end = System.currentTimeMillis();
		return end - start;
		
	}

	public abstract void code();

}
