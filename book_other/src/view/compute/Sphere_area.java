package view.compute;

import java.util.Scanner;

public class Sphere_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入球的半径 r: ");
        float r = scanner.nextFloat();

        final double pi = 3.14;

        float v = (float) ((double) 4 / 3 * pi * r * r * r);
        System.out.println("球体的半径为: " + r);
        System.out.println("球的体积为: " + v);

        scanner.close();
    }
}
