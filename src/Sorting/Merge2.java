package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2 {

    // This is the "Conquer" and "Combine" part.
    // It takes two sorted halves of the array and merges them into one sorted part.
    public static void merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary storage
        int left = start;      // Starting index of the first half
        int right = mid + 1;   // Starting index of the second half

        // Compare elements from both halves and add the smaller one to the temp list
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If there are any remaining elements in the left half, add them
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If there are any remaining elements in the right half, add them
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the sorted elements from the temp list back into the original array
        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i-start);
        }
    }

    // This is the "Divide" part.
    // It keeps splitting the array into two halves until each part has only one element.
    public static void sort(int[] arr, int start, int end) {
        // Base case: The recursion stops when a section has 0 or 1 elements,
        // as it's already sorted.
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        // Recursively sort the left half
        sort(arr, start, mid);
        // Recursively sort the right half
        sort(arr, mid + 1, end);

        // Merge the two sorted halves
        merge(arr, start, mid, end);
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 77, 8, 9, 0, 3, 2, 4, 1, 56, 78, 54, 32, 34, 345, 678, 987, 2, 344, 247};
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call sort with the correct ending index (n-1)
        sort(arr, 0, n - 1);

        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}
