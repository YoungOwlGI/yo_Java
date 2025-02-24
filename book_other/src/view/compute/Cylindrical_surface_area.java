package view.compute;

import java.util.Scanner;

public class Cylindrical_surface_area {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入圆柱体的底边半径 r: ");
        float r = scanner.nextFloat();
        System.out.print("请输入圆柱体的高 h: ");
        float d = scanner.nextFloat();

        final double pi = 3.14;

        float v = (float) (2 * pi * r * (r + d));
        System.out.println("圆柱体的表面积为: " + v);

        scanner.close();
    }
}
