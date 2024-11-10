package org.example.week6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int[] values = {3, 2, 5, 4, 8};
        //System.out.println(Arrays.toString(values));
        //swap(values, 1, 0);
       // System.out.println(Arrays.toString(values));
        //swap(values, 0, 3);
        //System.out.println(Arrays.toString(values));


        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        //System.out.println("Values of the array: " + Arrays.toString(array));
        //System.out.print("Enter searched number: ");
       // String searchedValue = reader.nextLine();
        //System.out.println();

       // boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        // Print the binary search result
        //if (result) {
         //   System.out.println("Value found in the array.");
       // } else {
       //     System.out.println("Value not found in the array.");
        //}

            int[] array1 = {5, 1, 3, 4, 2};
            printElegantly(array1);




        reader.close();
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfsmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println(); // Move to a new line after printing
    }



}
