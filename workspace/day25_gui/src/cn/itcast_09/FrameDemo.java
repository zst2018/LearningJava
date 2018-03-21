package cn.itcast_09;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月17日 下午4:46:36 
* 类说明 
*/
public class FrameDemo {
	public static void main(String[] args) {
		final Frame f = new Frame("多级菜单");
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		final String name = f.getTitle();
		
		//创建菜单栏
		MenuBar mb = new MenuBar();
		//创建菜单
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("更改名称");
		
		//创建菜单项
		final MenuItem mi1= new MenuItem("好好学习");
		final MenuItem mi2 = new MenuItem("天天向上");
		MenuItem mi3 = new MenuItem("恢复标题");
		
		MenuItem mi4 = new MenuItem("打开及时本");
		
		MenuItem mi5 = new MenuItem("退出系统");
		
		//添加
		m2.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		
		m1.add(m2);
		m1.add(mi4);
		m1.add(mi5);
		
		mb.add(m1);
		//f.setMenuBar(m1);
		
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
		
		mi1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setTitle(mi1.getLabel());
			}
		});
		
		mi2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setTitle(mi2.getLabel());
			}
		});
		
		
		mi3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setTitle(name);
			}
		});
		
		mi4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("notpad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		mi5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
			
		});
		
		//设置窗口显示
		f.setVisible(true);
		
	}


}
