package cn.itcast_11;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午6:36:30 
* 类说明 
* 需求：在指定的时间，删除我们指定的目录
* 
*/
class DeleteFolder extends TimerTask{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File srcFolder = new File("demo");
		
		deleteFolder(srcFolder);
		//t.cancel();
	}
	//递归删除目录
	public void deleteFolder(File srcFolder){
		File[] fileArray = srcFolder.listFiles();
		if(fileArray != null){
			for(File file : fileArray){
				if(file.isDirectory()){
					deleteFolder(file);
				}else{
					file.delete();
				}
			}
			//srcFolder.delete();
			System.out.println(srcFolder.getName()+";"+srcFolder.delete());
		}
	}
}
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		
		String s = "2018-03-16 10:06:30"
				+ "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date d = sdf.parse(s);
		
		t.schedule(new DeleteFolder(),d);
		
		
	}
	

}
