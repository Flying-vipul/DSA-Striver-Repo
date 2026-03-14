package Sorting;

public class PracticePlayGround extends BubbleSort{


   public static  void Sort(int[] arr, int n) {
       // Selection Sort
       for (int i = 0; i <n-1; i++) {
           int smallIdx = i;
           for (int j = i+1; j <n ; j++) {
               if(arr[j] < arr[smallIdx]){
                   smallIdx=j;
               }
           }
           int temp = arr[i];
           arr[i]=arr[smallIdx];
           arr[smallIdx] = temp;


       }
   }
    public static void main(String[] args) {
        BubbleSort s1 = new BubbleSort();
        int[] arr = {4,5,6,7,3,2,1};
        int n = arr.length;
        Sort(arr,n);
        Display(arr,n);
    }
}
