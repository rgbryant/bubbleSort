/*
 * A class containing my bubble sort algorithm
 */

import java.util.Arrays;

/**
 *
 * @author Robert Bryant
 */
public class BubbleSort {

    /*
     *This is my improved bubble sort algorithm.  It tracks the position of the
     *last swap to move past any partially sorted sections.  This is similar to
     *some implementations that check if the array is finished sorting.
     *
     * Preconditions: None
     * 
     * Postconditions: numbers is sorted, numbers is printed to the console 
     */
    public static void sort(int[] numbers) {
        int temp;
        int lastFlip;

        for (int i = numbers.length - 1; i > 0; i = lastFlip) {
            lastFlip = 0;
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    lastFlip = j;
                }
            }
        }
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
	}
}
