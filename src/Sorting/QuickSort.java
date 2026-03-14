package Sorting;

public class QuickSort {

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void Quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pi = partition(arr, start, end);
        // for left side
        Quick(arr, start, pi - 1);
        // for right side
        Quick(arr, pi + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            // If the current element is smaller than the pivot
            if (arr[i] <= pivot) count++;
        }
        int pivotIdx = start+count;
        swap(arr, start, pivotIdx);
        int i = start;
        int j = end;

        //elements lesser or equal left , greater -> right side of pivotIdx
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7,99,2,3,4,66,7,4,6,8,9,1,0,2};
        int n = arr.length;
        Quick(arr, 0, arr.length - 1);


    }
}
