// 第一版位于P28，第二版位于P58，第三版位于P68

package view;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        int i;
        String answer = "y";
        Scanner in = new Scanner(System.in);
        while (answer.equals("y")) {
        System.out.println("\t\t欢迎使用淘淘乐购物系统");
        System.out.println("*********************************************************");
        System.out.println("\t\t1. 登录系统");
        System.out.println("\t\t2. 退出");
        System.out.println("*********************************************************");
        System.out.println("请选择数字（1-2）：");
        i = in.nextInt();
        switch (i) {
            case 1:
                System.out.println("登录成功！");
                break;
            case 2:
                System.out.println("退出系统！");
                break;
            default:
                System.out.println("输入错误，请输入1-2之间的数字！");
                break;
        }
        System.out.println("你需要重新选择吗？（y/n）");
        answer = in.next();
    }
    System.out.println("欢迎下次使用！");
    }
}
