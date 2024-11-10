package org.example.week6;

public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the middle element is the searched value
            if (array[mid] == searchedValue) {
                return true;
            }

            // If the searched value is greater, ignore the left half
            if (array[mid] < searchedValue) {
                low = mid + 1;
            }
            // If the searched value is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Value not found
        return false;
    }
}
