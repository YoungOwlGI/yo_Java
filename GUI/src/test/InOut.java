package test;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 功能：鼠标移动到按钮x  上即可改变颜色
 */
public class InOut {
	public static void main(String[] args) {
		Frame f=new Frame("更改颜色");

		Button red=new Button("cyan");

		f.setLayout(new FlowLayout());

		f.setBounds(400, 200, 800, 400);

		f.add(red);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		//添加功能：用鼠标控制按钮

		//1、动作事件
//		red.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				f.setBackground(Color.red);
//			}
//		});

		//2、点击事件(与1功能相似都是鼠标点击按键更改颜色)
//		red.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				f.setBackground(Color.red);
//			}
//		});

		//3、进入、退出事件
		red.addMouseListener(new MouseAdapter() {
			//进入变为红色
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.cyan);
			}

			//移出变为白色
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.white);
			}
		});

		f.setVisible(true);

	}
}

