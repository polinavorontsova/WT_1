package by.bsuir.wt.lab_1.task_8;

import java.util.Arrays;
import java.util.Scanner;

public class EighthTask {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int[] findIndexes(int[] firstSequence, int[] secondSequence) {
        int[] resSequence = new int[secondSequence.length];

        for (int i = 0; i < secondSequence.length; i++) {
            int index = 0;
            while (index < firstSequence.length && firstSequence[index] < secondSequence[i]) {
                index++;
            }
            resSequence[i] = index - 1;
        }

        return resSequence;
    }

    private static int[] fillArray() {
        int size = SCANNER.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter [%d] element: ", i + 1);
            array[i] = SCANNER.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of first sequence: ");
        int[] firstSequence = fillArray();

        System.out.println("Enter size of second sequence: ");
        int[] secondSequence = fillArray();

        int[] indexes = findIndexes(firstSequence, secondSequence);
        System.out.println(Arrays.toString(indexes));
    }
}