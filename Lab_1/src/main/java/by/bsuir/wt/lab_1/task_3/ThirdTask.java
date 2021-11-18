package by.bsuir.wt.lab_1.task_3;

import java.util.Scanner;

import static java.lang.Math.tan;

public class ThirdTask {

    private static void calcFuncValues(int a, int b, double h) {
        double funcValue;
        for (double x = a; x <= b; x += h) {
            funcValue = tan(x);
            System.out.println(x + " | " + funcValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the beginning of the gap: ");
        int a = scanner.nextInt();

        System.out.println("Enter the end of the gap: ");
        int b = scanner.nextInt();

        System.out.println("Enter step: ");
        double h  = scanner.nextDouble();

        calcFuncValues(a, b, h);
    }
}
