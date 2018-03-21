package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午8:36:50 
* 类说明 
* 需求：把按钮添加到窗体，并对按钮添加一个点击事件
* A  创建窗体对象
* B 创建按钮对象
* C把按钮添加到窗体
* D 窗体显示
* 
*/
public class FrameDemo {
	public static void main(String[] args) {
		//创建窗体对象
		Frame f = new Frame("添加按钮");
		//设置属性
		f.setBounds(400,200,400,300);
		
		//设置流式布局方案
		f.setLayout(new FlowLayout());
		
		
		//创建按钮对象
		Button bu = new Button("你点呀");
		bu.setSize(20,10);
		
		//把按钮添加到窗体上
		f.add(bu);
		
		//窗体显示
		f.setVisible(true);
		
		//设置窗体可以关闭
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("你再点咬你");
			}
		});
		
		
	}

}
