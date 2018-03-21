package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午9:25:58 
* 类说明 
* 
* 判断E盘目录下是否有后缀名为.jpg 的文件，如果有，就输出此文件名称
* 	思路：获取的时候就已经是满足条件的了，然后再输出
* 接口：文件名称过滤器
* 	public String[] list(FilenameFileter filter)
* 	public File[] listFiles(FilenameFilter filter)
* 
* 	
*
* 
* 
*/
public class FileDemo2 {
	public static void main(String[] args) {
		//封装E盘判断目录
		File file = new File("E:\\");
				
		//获取该目录下所有文件或者文件夹的String数组
		//File[] fileArray= file.listFiles();
		
		String[] strArray = file.list(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//return false;
				//return true;
				
				//通过这个测试。就可以知道，是否把这个文件或文件夹加到数组中，取决于返回值是兔爷还是false
				System.out.println(dir+"----"+name);
				File file = new File(dir,name);
				boolean flag = file.isFile();
				boolean flag2 = name.endsWith(".txt");
				
				return flag&&flag2;
			}
		});
		//遍历
		for(String s : strArray){
			System.out.println(s);
		}
	}

}
