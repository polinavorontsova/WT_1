package by.bsuir.wt.lab_1.task_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SixthTask {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Queue<Integer> NUMBERS_QUEUE = new LinkedList<>();

    private static void fillQueue() {
        System.out.println("Enter amount of numbers: ");
        int amountOfNumbers = SCANNER.nextInt();
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.printf("Enter [%d] number: ", i + 1);
            NUMBERS_QUEUE.add(SCANNER.nextInt());
        }
    }

    private static Integer[][] createMatrix() {
        Integer[][] matrix = new Integer[NUMBERS_QUEUE.size()][NUMBERS_QUEUE.size()];
        for (int i = 0; i < NUMBERS_QUEUE.size(); i++) {
            matrix[i] = NUMBERS_QUEUE.toArray(new Integer[0]);
            NUMBERS_QUEUE.add(NUMBERS_QUEUE.element());
            NUMBERS_QUEUE.remove();
        }
        return matrix;
    }

    private static void showMatrix() {
        Integer[][] matrix = createMatrix();

        for (Integer[] integers : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(integers[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fillQueue();
        showMatrix();
    }
}
