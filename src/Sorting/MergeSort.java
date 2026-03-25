//package Sorting;
//
//import java.util.ArrayList;
//
//public class MergeSort  extends BubbleSort{
//    // it is divide and conqure rule.
//
//
//    public static void merge(int[] arr, int start, int mid , int end) {
//
//
//         ArrayList<Integer> temp = new ArrayList<>();
//
//        // divide the arrays list
//        int i =start;
//        int j= mid+1;
//        while (i <= mid && j<= end) {
//            if(arr[i] < arr[j]){
//                temp.add(arr[i]);
//                i++;
//            }else {
//                temp.add(arr[j]);
//                j++;
//            }
//        }
//        //Remaining ele of left side
//        while (i <= mid) {
//            temp.add(arr[i]);
//            i++;
//        }
//        //Remaining ele of right side
//        while (j <= end) {
//            temp.add(arr[j]);
//            j++;
//        }
//
//        // now print those temp ele into original array
//        for (int k = start; k <= end; k++) {
//            arr[k] =  temp.get(k-start);
//        }
//    }
//    public static void sort(int[] arr, int start, int end) {
//
//        if(start >= end) {
//            return;
//        }
//        int mid = start+((end-start)/2);
//
//            // for left
//            sort(arr, start, mid);
//
//            // for right
//            sort(arr, mid + 1, end);
//
//            // merge method
//            merge(arr,start,mid,end);
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//        BubbleSort bub = new BubbleSort();
//        int[] arr = {3,5,77,8,9,0,3,2,4,1,56,78,54,32,34,345,678,987,2,344,247};
//        int n  = arr.length;
//        sort(arr,0,n-1);
//        Display(arr,n);
//
//    }
//}
