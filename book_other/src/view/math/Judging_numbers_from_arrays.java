package view.math;
import java.util.Scanner;

public class Judging_numbers_from_arrays {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字: ");
        int inputNumber = scanner.nextInt();
        boolean found = false; // 标记是否找到输入的数字

        // 遍历数组，判断输入数字是否存在
        for (int number : myArray) {
            if (number == inputNumber) {
                found = true;
                break; // 找到后跳出循环
            }
        }

        // 输出结果
        if (found) {
            System.out.println("输入的数字 " + inputNumber + " 在数组中。");
        } else {
            System.out.println("输入的数字 " + inputNumber + " 不在数组中。");
        }

        scanner.close(); // 关闭扫描器
    }
}
