package test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame {
	public static void main(String[] args) {
		//创建窗体对象
		java.awt.Frame f=new java.awt.Frame();

		//创建窗体对象，并设置窗体标题为zfliu，和f.setTitle("zfliu96");方法功能相同
		//Frame f=new Frame("zfliu");

		//设置窗体大小
		f.setSize(800, 400);

		//设置窗体位置
		f.setLocation(200,300);

		//可以直接设置窗体的位置和大小
		//f.setBounds(200, 300, 800, 400);

		//设置窗体名字
		f.setTitle("zfliu96");

		//设置窗体是否可见，先设置好窗体的属性再将其显示出来
		f.setVisible(true);

		//关闭窗体
		//事件源：f
		//事件：对窗体进行处理
		//事件处理：关闭窗口（System.exit(0)）；需要实现WindowListener接口，并重写关闭窗口的方法
		//事件监听
		//使用适配器模式，只需要重写需要用的方法即可，WindowAdapter适配器类
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}

