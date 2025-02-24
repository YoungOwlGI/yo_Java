// 第一版位于P92

package data;
import java.util.Scanner;

public class CustTest {
    public String custNo;
    public String custName;
    public String custBir;
    public int custScore;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CustTest cust = new CustTest();
        System.out.println("***********欢迎使用会员管理系统**********");
        System.out.println("请输入会员卡号：");
        cust.custNo = in.next();
        System.out.println("请输入会员姓名：");
        cust.custName = in.next();
        System.out.println("请输入会员生日：");
        cust.custBir = in.next();
        System.out.println("请输入会员积分：");
        cust.custScore = in.nextInt();
        System.out.println("***********会员信息**********");
        System.out.println("\t会员卡号\t\t会员姓名\t\t会员生日\t\t会员积分");
        System.out.println("\t" + cust.custNo + "\t\t" + cust.custName + "\t\t" + cust.custBir + "\t\t" + cust.custScore);
    }
}
