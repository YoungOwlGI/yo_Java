package GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

/**
 * youngowl 类负责创建和管理 GUI 组件。
 */
public class youngowl {
    private JComboBox<String> comboBox1;
    private JRadioButton 以太战线RadioButton;
    private JRadioButton 星天演武仪典RadioButton;
    private JRadioButton 匹诺康尼RadioButton;
    private JTree tree1;
    private JSlider slider1;
    private JCheckBox 捉鬼小队CheckBox;
    private JCheckBox 银河忍法帖CheckBox;
    private JCheckBox 垃圾桶大战CheckBox;
    private JTabbedPane tabbedPane1;
    private JSpinner spinner1;
    private JProgressBar progressBar1;
    private JButton button2;
    private JTree tree2;
    private JTable table1;

    public static void main(String[] args) {
        System.out.println("Young Owl GUI");
    }

    public youngowl() {
        // 添加组件的事件监听器
        comboBox1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // 处理组件大小调整事件
                System.out.println("ComboBox resized");
            }
        });

        tree1.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                // 处理鼠标滚轮事件
                System.out.println("Mouse wheel moved");
            }
        });

        button2.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                // 处理组件层次结构变化事件
                System.out.println("Button hierarchy changed");
            }
        });
        捉鬼小队CheckBox.addChangeListener(new ChangeListener() {
            /**
             * @param e a ChangeEvent object
             */
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
    }

    // 其他方法和逻辑可以在此处添加
}

// 主方法示例（可在需要时添加）
class Main {
    public static void main(String[] args) {
        // 创建 GUI 界面并展示
        JFrame frame = new JFrame("Young Owl GUI");

        frame.pack(); // 自动调整组件大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // 设置窗口大小
        frame.setVisible(true); // 显示窗口
    }
}
