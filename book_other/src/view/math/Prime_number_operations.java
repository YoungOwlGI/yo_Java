package view.math;
public class Prime_number_operations {
    public static void main(String[] args) {
        System.out.println("素数是：");
        int count = 0;
        //   这个是素数运算程序
        int num = 100;
        int i = 2;
        while (i <= num) {
            int j = 2;
            while (j <= i / j) {
                if (i % j == 0) {
                    break;   // 不是素数
                }
                j++;
            }
            if (j > i / j) {
                System.out.print(i + " ");
                count ++;
                if (0 == count % 5) {
                    System.out.println();
                }
            }
            i++;
        }
    }
}