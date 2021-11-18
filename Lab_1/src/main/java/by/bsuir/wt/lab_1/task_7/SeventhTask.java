package by.bsuir.wt.lab_1.task_7;


import java.util.Arrays;
import java.util.Scanner;

public class SeventhTask {
    private static double[] array;

    private static void swap(int firstIndex, int secondIndex) {
        double temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static void shellSort() {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                swap(i, i + 1);
                i = i > 0 ? i - 1 : i + 1;
            } else {
                i++;
            }
        }
    }

    private static void fillArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        array = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter [%d] element: ", i + 1);
            array[i] = scanner.nextDouble();
        }
    }

    public static void main(String[] args) {
        fillArray();
        shellSort();
        System.out.println(Arrays.toString(array));
    }
}
