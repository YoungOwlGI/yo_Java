package view.math;

import java.util.Scanner;

public class Maximum_value_of_array {
    public static void main(String[] args) {
        int u = 5;
        int[] data = new int[u]; // 声明一个数组以存储5个数字
        Scanner scanner = new Scanner(System.in);
        // 读取用户输入的数字
        for (int i = 0; i < u; i++) {
            System.out.println("请输入数字：");
            while (true) {
                try {
                    data[i] = Integer.parseInt(scanner.nextLine()); // 捕获输入并转为整数
                    break; // 输入成功则跳出循环
                    }
                catch (NumberFormatException e) {
                    System.out.println("输入有误，请重新输入！"); // 输入有误则提示重新输入
                }
            }
        }

        // 计算最大值
        int max = data[0];
        for (int i = 1; i < u; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("最大值是：" + max); // 输出最大值
    }
}

