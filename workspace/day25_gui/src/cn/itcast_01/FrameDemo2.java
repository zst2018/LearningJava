package cn.itcast_01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午7:27:22 
* 类说明 
*/
public class FrameDemo2 {
	public static void main(String[] args) {
		//创建独享
		Frame f = new Frame("方法调动的前后关系");
		
		//设置大小
		//f.setSize(400,300);
		//Dimension(int width,int height)
		Dimension d = new Dimension(400,300);
		f.setSize(d);
		
		
		//设置位置
		//f.setLocation(400,200);
		//Point(x,y)
//		Point p = new Point(400,200);
//		f.setLocation(p);
		
		
		//setBounds(x,y,width,height)
		f.setBounds(400,200,400,300);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.setVisible(true);
	}

}
