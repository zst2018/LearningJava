package cn.itcast_02;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 上午11:27:45 
* 类说明 
* 
* 删除打死内容的目录
* 分析：
* 	A封装目录
* 	B获取该目录下的所有文件或文件夹
* 	C遍历该File数组，得到每一个File对象
* 	D判断该File对象是否是文件夹
* 		是 回到B
* 		否 就删除
* 
*/
public class FileDeletaDemo {
	public static void main(String[] args) {
		//封装目录
		File srcFolder = new File("demo");
		
		//递归实现
		deleteFolder(srcFolder);
		
	}

	private static void deleteFolder(File srcFolder) {
		// TODO Auto-generated method stub
		//获取该目录下的所有文件或者文件夹的File数组
		File[] fileArray = srcFolder.listFiles();
		
		//遍历该File 数组，得到每一个File对象
		if(fileArray !=null){
			//避免空指针异常
			for(File file : fileArray){
			//判断该File对象是否是文件夹
				if(file.isDirectory()){
					deleteFolder(file);
				}else{
					System.out.println(file.getName()+"   "+file.delete());
				}
			}
			System.out.println(srcFolder.getName()+"   "+srcFolder.delete());
		}
	}

}
