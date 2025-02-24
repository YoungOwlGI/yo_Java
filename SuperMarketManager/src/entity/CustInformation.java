// 第一版位于P79

package entity;
import java.util.Scanner;

public class CustInformation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] cust = new String[2][3];
        System.out.println("会员信息依次为会员卡号、会员姓名、会员积分");
        for (int i = 0; i < 2; i++) {
            System.out.println("请输入第" + (i + 1) + "个会员信息：");
            for (int j = 0; j < 3; j++) {
                cust[i][j] = in.next();
            }
        }
        System.out.println("会员信息如下：");
        System.out.println("会员卡号\t会员姓名\t会员积分");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cust[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
