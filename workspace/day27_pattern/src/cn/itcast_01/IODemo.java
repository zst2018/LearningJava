package cn.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午4:44:59 
* 类说明 
*/
public class IODemo extends GetTime {

	@Override
	public void code() {
		// TODO Auto-generated method stub
		try{
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("a.avi"));
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("b.avi"));
			
			byte[] bys = new byte[1024];
			int len = 0 ;
			while((len = bis.read(bys)) != -1){
				bos.write(bys,0,len);
			}
			bos.close();
			bis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
