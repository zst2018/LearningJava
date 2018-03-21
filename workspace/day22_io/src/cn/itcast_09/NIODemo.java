package cn.itcast_09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午10:15:10 
* 类说明 
* jdk7之后，出现新IO包  nio 提高了IO流的操作效率。但目前还没有大范围应用
* path 路径
* paths：有一个静态方法返回路径
* public static path get（URI rui）
* File 提供了静态方法供我们使用
* public static long copy(Path source,Outputtream out)
* public static Path write(Path path,Iterable<? extends CharSequence>
* lines,Charset...)
*/
public class NIODemo {
	public static void main(String[] args) throws IOException, IOException {
		Files.copy(Paths.get("ByteArrayStreamDemo.java"),
				new FileOutputStream("copy.java"));
		
		
	}

}
