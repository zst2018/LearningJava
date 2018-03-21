package cn.itcast_05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午9:21:42 
* 类说明 
*/
public class FrameDemo {
	public static void main(String[] args) {
		//创建窗体对象
		Frame f = new Frame("数据转移");
		//设置窗体属性和布局
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//创建文本框
		TextField tf = new TextField(20);
		//创建按钮
		Button bu = new Button("数据转移");
		//创建文本域  10行40列
		TextArea ta = new TextArea(10,40);
		
		//把组件添加到窗口
		f.add(tf);
		f.add(bu);
		f.add(ta);
		
		//设置窗口关闭
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				System.exit(0);
			}
		});
		//对按钮添加事件
		bu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//获取文本框的值
				String tf_str = tf.getText().trim();
				//清空数据
				tf.setText("");
				
				//设置给文本域
				//ta.setText(tf_str); 替换
				//追加和换行
				
				ta.append(tf_str+"\r\n");
				
				//获取光标
				tf.requestFocus();
			}
		});
		//设置窗体显示
		f.setVisible(true);
		
		
		
		
		
	}

}
