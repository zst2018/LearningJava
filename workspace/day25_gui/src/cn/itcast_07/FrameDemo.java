package cn.itcast_07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月17日 下午3:45:03 
* 类说明 
* 
*/
public class FrameDemo {
	public static void main(String[] args) {
		
		//创建窗体对象并设置属性
		Frame f = new Frame("不能输入非数字字符");
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//创建label标签对象
		Label label = new Label("请输入你的QQ号码，不能是非数字，不信你试试");
		TextField tf = new TextField(40);
		
		//添加到窗体上
		f.add(label);
		f.add(tf);
		
		
		//设置窗体关闭
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				System.exit(0);
			}
		});
		
		//给文本框添加事件
		tf.addKeyListener(new KeyAdapter() {
			//取消事件。如果取得的不是数字字符。
			//首先获取字符，然后判断字符，最后释放或者取消字符
			@Override
			public void keyPressed(KeyEvent e){
				//char getKeyChar()
				char ch = e.getKeyChar();
				//System.out.println(ch);
				if(!(ch>='0' && ch<='9')){
					e.consume();
				}
				
			}
			
		} );
		
		//设置窗体可见
		f.setVisible(true);
	}

}










