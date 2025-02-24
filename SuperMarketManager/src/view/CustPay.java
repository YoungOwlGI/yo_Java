//第一版在P47

package view;
import java.util.Scanner;

public class CustPay {
    public static void main(String[] args) {
        int shirtPrice, shirtNu, shoePrice, shoeNu;
        final double DI = 0.8;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入衬衣的价格: ");
        shirtPrice = in.nextInt();
        System.out.println("请输入衬衣的数量: ");
        shirtNu = in.nextInt();
        System.out.println("请输入运动鞋的价格: ");
        shoePrice = in.nextInt();
        System.out.println("请输入运动鞋的数量: ");
        shoeNu = in.nextInt();
//        以下3行书上没有添加double和int。
        double finalPay = (shirtPrice * shirtNu + shoePrice * shoeNu) * DI;
        double returnMoney = 1200 - finalPay;
        int score = (int) finalPay / 100 * 3;
        System.out.println("\n*****************消费清单*****************\n");
        System.out.println("购买物品\t" + "单价\t" + "\t数量\t" + "\t金额\t");
        System.out.println("衬衣\t\t" + "￥" + shirtPrice + "\t" + shirtNu + "\t\t" + "￥" + (shirtPrice * shirtNu) + "\t");
        System.out.println("运动鞋\t" + "￥" + shoePrice + "\t" + shoeNu + "\t\t" + "￥" + (shoePrice * shoeNu) + "\t");
        System.out.println("折扣：\t\t8折");
        System.out.println("金额总计:\t" + "\t￥" + (double) Math.round (finalPay * 100) / 100);
        System.out.println("实际付费：\t\t￥1200");
        System.out.println("找钱：\t"+ "\t￥" + (double) Math.round (returnMoney * 100) / 100);
        System.out.println("本次购物所获的积分是：\t"+ "\t" + score);
        System.out.println("********************************************");
    }
}
