package by.bsuir.wt.lab_1.task_2;

import java.util.Scanner;

public class SecondTask {
    private static boolean isPointInUpperRect(double x, double y) {
        return (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }

    private static boolean isPointInLowerRect(double x, double y) {
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter y: ");
        double y = scanner.nextDouble();

        boolean result = isPointInUpperRect(x, y) || isPointInLowerRect(x, y);
        System.out.println(result);
    }
}
