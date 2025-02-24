package test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 * 添加并设置按钮功能实例(按钮的功能：实现文本框内的数据向文本域转移)
 * 		1、创建窗体对象
 * 		2、创建按钮对象，并设置按钮功能
 * 		3、将按钮添加到窗体中
 * 		4、窗体显示
 * 		5、窗体关闭功能
 */
public class MyButton {
	public static void main(String[] args) {
		Frame f=new Frame("数据转移");

		//设置分本框
		TextField tf=new TextField(20);

		//设置文本域
		TextArea ta=new TextArea(10,40);

		f.setBounds(400, 300, 400, 300);

		Button b=new Button("Button1");

		//设置按钮功能
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获取文本框的内容，并去除字符串前面和后面的空格
				String s=tf.getText().trim();

				//将字符串内容设置到文本域中
				//ta.setText(s);

				//追加内容，并换行
				ta.append(s+"\n");

				//复制结束后可以清楚文本框的内容
				tf.setText(null);

				//获取光标，使光标一直在文本框内
				tf.requestFocus();
			}
		});

		//将按钮添加到窗体中
		f.add(tf);
		f.add(b);
		f.add(ta);

		//设置窗体布局模式为流式布局
		f.setLayout(new FlowLayout());

		//关闭窗口
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);


	}
}

