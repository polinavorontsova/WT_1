package by.bsuir.wt.lab_1.task_5;

import java.util.Scanner;

public class FifthTask {

    private static int findSmallestGreatestIndex(int[] array, int rightBorder, int key) {
        int leftBorder = -1;
        while (rightBorder - leftBorder > 1) {
            int m = leftBorder + (rightBorder - leftBorder) / 2;
            if (array[m] >= key) {
                rightBorder = m;
            } else {
                leftBorder = m;
            }
        }

        return rightBorder;
    }

    private static int findMaxSequenceLength(int[] array) {
        int[] subsequenceTails = new int[array.length];
        subsequenceTails[0] = array[0];
        int length = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < subsequenceTails[0]) {
                subsequenceTails[0] = array[i];
            } else if (array[i] > subsequenceTails[length - 1]) {
                subsequenceTails[length++] = array[i];
            } else {
                subsequenceTails[findSmallestGreatestIndex(subsequenceTails, length - 1, array[i])] = array[i];
            }
        }

        return length;
    }

    public static int findAmountValuesToRemove(int[] array) {
        return array.length - findMaxSequenceLength(array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of sequence: ");
        int sequenceLength = scanner.nextInt();
        int[] sequence = new int[sequenceLength];

        for (int i = 0; i < sequenceLength; i++) {
            System.out.printf("Enter [%d] element: ", i + 1);
            sequence[i] = scanner.nextInt();
        }

        System.out.println(findAmountValuesToRemove(sequence) + " elements need to be removed");
    }
}
