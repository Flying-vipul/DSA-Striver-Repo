//package Sorting;
//
//public class PracticeQuick extends BubbleSort {
//
//    public static void swap(int[] arr, int x, int y) {
//        int temp = arr[x];
//        arr[x] = arr[y];
//        arr[y] = temp;
//    }
//
//    public static void Quick(int[] arr, int start, int end) {
//        if (start >= end) return;
//
//        int pi = party(arr, start,end);
//        // for left side
//        Quick(arr,start,pi-1);
//
//        // for right side
//        Quick(arr,pi +1 ,end);
//    }
//
//    public static int party(int[] arr, int start , int end) {
//        int pivot =arr[start];
//        int count = 0;
//        for (int i = start+1; i <=end ; i++) {
//            if (arr[i] <= pivot) count++;
//
//        }
//        int pivotIdx = start+count;
//        swap(arr,start,pivotIdx);
//        int i =start;
//        int j = end;
//
//        while (i < pivotIdx && j > pivotIdx) {
//
//           while (arr[i] <= pivot) {
//               i++;
//           }
//           while (arr[j] > pivot  ){
//               j--;
//           }
//           if (i < pivotIdx && j > pivotIdx) {
//               swap(arr,i,j);
//               i++;
//               j--;
//           }
//        }
//        return pivotIdx;
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int[] arr = {2,4,7,99,2,3,4,66,7,4,6,8,9,1,0,2};
//        int n= arr.length;
//        Quick(arr,0, arr.length-1);
//        Display(arr, n);
//
//
//
//    }
//}
