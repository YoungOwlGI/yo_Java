// 第一版位于P28，第二版位于P59（稍有改动）,第三版位于P69

package view;
import java.util.Scanner;

public class SuperMain {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String answer = "y";
        while (answer.equals("y")) {
        System.out.println("\t\t欢迎使用淘淘乐购物管理系统");
        System.out.println("*****************************************");
        System.out.println("\t\t    1.会员信息管理");
        System.out.println("\t\t    2.购物结算");
        System.out.println("\t\t    3.真情回馈");
        System.out.println("\t\t    4.注销");
        System.out.println("*****************************************");
        System.out.println("请选择数字(1-4):");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("会员信息管理");
                break;
            case 2:
                System.out.println("购物结算");
                break;
            case 3:
                System.out.println("真情回馈");
                break;
            case 4:
                System.out.println("注销");
                break;
            default:
                System.out.println("输入错误，请重新输入（1-4）之间的数字！");
                break;
        }
        System.out.println("是否继续(y/n):");
        answer = in.next();
        }
        System.out.println("感谢您的使用，欢迎下次光临！");
    }
}
