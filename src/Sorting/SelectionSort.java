//package Sorting;
//
//import java.awt.*;
//
//public class SelectionSort extends BubbleSort {
//
//    public static void Sort(int[] arr, int n){
//        for (int i = 0; i < n-1; i++) {
//            int smallIdx =i;
//            for (int j = i+1; j <n; j++) {
//                if (arr[j] < arr[smallIdx]) {
//                    smallIdx = j;
//                }
//            }
//            int temp =arr[i];
//            arr[i]=arr[smallIdx];
//            arr[smallIdx]= temp;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2,4,5,1,3};
//        int n = arr.length;
//        BubbleSort Bsort = new BubbleSort();
//        Sort(arr,n);
//        Display(arr,n);
//
//
//    }
//}
