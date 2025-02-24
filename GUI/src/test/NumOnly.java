package test;
/*
 * 实现文本框输入仅能输入数字的功能
 */
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class NumOnly {
	public static void main(String[] args) {
		Frame f=new Frame("只能输入数字");

		Label l=new Label("只能输入数字");

		TextField tf=new TextField(20);

		f.setBounds(200,300,400,200);

		f.setLayout(new FlowLayout());

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.add(l);
		f.add(tf);

		//给文本框添加键盘录入事件
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				//获取文本输入字符
				char ch=e.getKeyChar();

				//如果是数字则取消事件
				if(!(ch>='0'&&ch<='9')) {
					e.consume();
				}

			}
		});

		f.setVisible(true);
	}
}

