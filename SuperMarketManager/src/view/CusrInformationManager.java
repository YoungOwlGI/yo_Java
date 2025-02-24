// 第一版位于P29，第二版位于P60，第三版位于P70

package view;
import java.util.Scanner;

public class CusrInformationManager {
    public static void main(String[] args) {
        String answer = "y";
        while (answer.equals("y")) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t\t淘淘乐购物管理系统 > 会员信息管理\n");
        System.out.println("\t*******************************************");
        System.out.println("\t\t1. 添加会员信息");
        System.out.println("\t\t2. 修改会员信息");
        System.out.println("\t\t3. 查询会员信息");
        System.out.println("\t\t4. 显示会员信息");
        System.out.println("\t5. 删除会员信息");
        System.out.println("\t*******************************************");
        System.out.print("请选择数字（1-5）：");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. 添加会员信息");
                break;
            case 2:
                System.out.println("2. 修改会员信息");
                break;
            case 3:
                System.out.println("3. 查询会员信息");
                break;
            case 4:
                System.out.println("4. 显示会员信息");
                break;
            case 5:
                System.out.println("5. 删除会员信息");
                break;
            default:
                System.out.println("输入错误，请重新输入！");
                break;
        }
        System.out.print("是否继续？(y/n)：");
        answer = scanner.next();
    }
        System.out.println("欢迎下次光临！");
        }
}
