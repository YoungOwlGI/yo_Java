package view.math;

import java.util.Arrays;
import java.util.Scanner;

public class Array_traversal {
    public static void main(String[] args) {
        int num;
        int u = 5;
        int[] data = new int[u];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < u; i++) {
            System.out.println("请输入数字：");
            num = scanner.nextInt();
            data[i] = num; // 将输入的数字存储到数组中
        }
        System.out.println(Arrays.toString(data)); // 输出数组的字符串表示
    }
}
