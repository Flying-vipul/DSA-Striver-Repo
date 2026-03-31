package Recursion;


import java.util.Arrays;

public class QuickSortRec {

    public static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pivIdx = partition(arr,low,high);
            quickSort(arr,low,pivIdx-1);
            quickSort(arr,pivIdx+1,high);
        }
    }
     public static int[] quick(int[] arr){
         quickSort(arr,0, arr.length-1);
         return arr;
     }
     public static int partition(int[] arr, int low, int high){
        int pivoit = arr[low];
        int i = low;
        int j= high;

        while(i<j){

            while(arr[i] <= pivoit && i <= high-1){
                i++;
            }

            while(arr[j] > pivoit && j >= low+1){
                j--;
            }
            if (i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
     }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr=  {4,6,2,5,7,9,1,3};
        quick(arr);
        System.out.println(Arrays.toString(arr));
    }
}
