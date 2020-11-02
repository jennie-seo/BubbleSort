/*
 * Programmer:
 * Date:
 * Purpose:
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Read in the array size
        System.err.println("How many numbers are there?");
        int size = input.nextInt();

        // Read in the array elements
        System.err.println("Enter the numbers:");
        int [] numbers = new int [size];
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        // TODO: Sort the array using Bubble Sort
        

        // Print out the sorted array
        System.err.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}
