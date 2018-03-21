package cn.itcast_06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午8:36:51 
* 类说明 
*获取功能
*	public String getAbsolutePath()  获取绝对路径
*   public String getPath()  获取相对路径
*   public String getName()  获取名称
*   public long length()    获取长度，字节数
*   public long lastModified()   获取上次（最后一次的）修改时间，返回的是毫秒值
* 
* 
*/
public class FileDemo {
	public static void main(String[] args) {
		//创建文件对象
		File file = new File("demo\\test.txt");
		System.out.println("getAbsolutePath: "+file.getAbsolutePath());
		System.out.println("getPath: "+file.getPath());
		System.out.println("getName: "+file.getName());
		System.out.println("length: "+file.length());
		System.out.println("lastModified: "+file.lastModified());
		//1520340157987
		Date d = new Date(1520340157987L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		
	}

}
