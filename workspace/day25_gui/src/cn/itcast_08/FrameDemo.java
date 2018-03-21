package cn.itcast_08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月17日 下午4:30:36 
* 类说明 
*/
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//创建菜单栏
		MenuBar mb = new MenuBar();
		//创建菜单
		Menu m = new Menu("文件");
		//创建菜单项
		MenuItem mi = new MenuItem("退出系统");
		
		//添加
		m.add(mi);
		mb.add(m);
		//设置菜单栏
		f.setMenuBar(mb);
		
		
		
		//设置窗口关闭
		f.addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				System.exit(0);
			}
			
		});
		mi.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
			
		});
		
		//设置创抽显示
		f.setVisible(true);
		
	}

}
