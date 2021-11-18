package by.bsuir.wt.lab_1.task_4;

import java.util.Scanner;

public class FourthTask {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int[] numberArray;

    private static void initArraySize() {
        System.out.println("Enter the size of the array: ");
        int arraySize = SCANNER.nextInt();
        numberArray = new int[arraySize];
    }

    private static void fillArray() {
        initArraySize();
        for (int i = 0; i < numberArray.length; i++) {
            System.out.printf("Enter [%d] number: ", i + 1);
            numberArray[i] = SCANNER.nextInt();
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 0) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i ++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static void showIndexesOfPrimeNumbers() {
        for (int i = 0; i < numberArray.length; i++) {
            if (isPrimeNumber(numberArray[i])) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fillArray();
        showIndexesOfPrimeNumbers();
    }
}
