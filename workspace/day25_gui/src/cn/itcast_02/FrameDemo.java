package cn.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午7:39:01 
* 类说明 
*/
public class FrameDemo {
	public static void main(String[] args) {
		//创建窗体
		Frame f = new Frame("窗体关闭案例");
		
		//设置窗体属性
		f.setBounds(400,200,400,300);

		//让窗体关闭
		//事件源
		//事件：对窗体的处理
		//事件处理：关闭窗口（system.exit(0)）
		//事件监听
//		f.addWindowListener(new WindowListener(){
//
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//				
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		//用适配器类改进
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				System.exit(0);
			}


		});
		
		//设置窗体可见
		f.setVisible(true);
		
	}

}
