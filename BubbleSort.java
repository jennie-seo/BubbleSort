/*
 * Programmer: Jennie Seo
 * Date: Novemeber 3, 2020
 * Purpose: Bubble sort any numbers
 */

import java.util.Scanner;
import java.util.Arrays;

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
        
        // Sort the numbers using bubble sort
        boolean swapped; 
        for (int i = 0; i < size - 1; i++) {	
        	System.err.println("Before Pass " + (i + 1) + ":");
        	System.out.println(Arrays.toString(numbers));
        	swapped = false;
        	for (int j = 0; j < size - i - 1; j++){
        		if (numbers[j] > numbers[j + 1]) {
        			int temp = numbers[j];
        			numbers[j] = numbers[j + 1];
        			numbers[j + 1] = temp;
        			swapped = true;
        		}
        	}
        	if (swapped == false)
        	break;
        }	
  
        // Print out the sorted array
        System.err.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}
