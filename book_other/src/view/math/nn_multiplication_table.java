package view.math;

public class nn_multiplication_table {
//    九九乘法表  nn是九九的缩写
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                int z = i * j;
//                在下一行中用(i * j)一样可以显示乘积
                System.out.print(j + " * " + i + " = " + z + "\t");
            }
            System.out.println();
//            此处换行
        }
    }
}
