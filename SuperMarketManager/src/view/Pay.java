//第一版在P40

package view;
import java.util.Scanner;
public class Pay {
    public static void main(String[] args) throws Exception {
        int shirtPrice, shirtNu, shoePrice, shoeNu;
        final double DI = 0.8;
//        输入是System.in，输出是System.out
//        try Exception块用于捕获异常，并进行处理，这个是书上没有的，我加上了（11、20-24）
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("请输入衬衣的价格: ");
            shirtPrice = in.nextInt();
            System.out.print("请输入衬衣的数量: ");
            shirtNu = in.nextInt();
            System.out.print("请输入运动鞋的价格: ");
            shoePrice = in.nextInt();
            System.out.print("请输入运动鞋的数量: ");
            shoeNu = in.nextInt();
        }
        Exception e = new Exception("输入有误，请重新输入！");
        if (shirtPrice <= 0 || shirtNu <= 0 || shoePrice <= 0 || shoeNu <= 0) {
            throw e;
            }

        System.out.println("\n*******消费清单*******");
        System.out.println("购买物品\t"+"单价\t"+"数量\t");
        System.out.println("衬衣\t\t"+"￥"+shirtPrice+"\t"+shirtNu+"\t");
        System.out.println("运动鞋\t"+"￥"+shoePrice+"\t"+shoeNu+"\t");
        System.out.println("折扣\t"+DI);
        System.out.println("********************");
//        这下面也是新增的
        double totalPrice = (shirtPrice * shirtNu + shoePrice * shoeNu) * DI;
        System.out.println("总价\t"+totalPrice);
    }
}