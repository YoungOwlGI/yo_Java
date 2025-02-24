package test;
/*
 * 功能：设置多级菜单，并实现各级菜单的功能
 */
import javax.sound.sampled.AudioFormat;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.charset.StandardCharsets;

public class MyMenu {
	public static void main(String[] args) {

		// 设置输入输出流使用 UTF-8 编码
		System.setProperty("file.encoding", "UTF-8");

		Frame f=new Frame("多级菜单");

		f.setBounds(400,300,400,200);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		String Menu = new String(f.getTitle().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
		//设置菜单条
		MenuBar mb=new MenuBar();

		//设置菜单
		Menu m1=new Menu("菜单");
		Menu m2=new Menu("设置颜色");

		//设置菜单项
		MenuItem mi1=new MenuItem("退出系统");
		MenuItem mi2=new MenuItem("blue");
		MenuItem mi3=new MenuItem("恢复默认颜色");

		m1.add(m2);
		m1.add(mi1);
		m2.add(mi2);
		m2.add(mi3);

		mb.add(m1);

		//将菜单条添加到窗体中
		f.setMenuBar(mb);

		//设置菜单项功能
		mi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setBackground(Color.blue);
			}
		});

		mi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setBackground(Color.WHITE);
			}
		});

		f.setVisible(true);
		// 确保在处理字符串时使用正确的编码

    }
	}
