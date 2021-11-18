package by.bsuir.wt.lab_1.task_1;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.abs;

public class FirstTask {
    private static double calcNumerator(double x, double y) {
        double sineOfSum = sin(x + y);
        return 1 + pow(sineOfSum, 2);
    }

    private static double calcDenominator(double x, double y) {
        double fractionValue = (2 * x) / (1 + pow(x * y, 2));
        return 2 + abs(x - fractionValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x value: ");
        double x = scanner.nextDouble();
        System.out.println("Enter y value: ");
        double y = scanner.nextDouble();

        double result = calcNumerator(x, y) / calcDenominator(x, y) + x;
        System.out.println("Result = " + String.format("%.2f", result));
    }
}
