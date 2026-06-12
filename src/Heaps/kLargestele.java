package Heaps;

import java.util.PriorityQueue;

public class kLargestele {

    public static int method(int[] arr, int k){
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0;i<k;i++){
            minHeap.add(arr[i]);
        }

        int l =k;
        while (n>l){
            if (minHeap.peek()<arr[l]){
                minHeap.remove();
                minHeap.add(arr[l]);
            }
            l++;
        }
        return minHeap.peek();
    }

    static void main() {
        int[] arr = {10,3,7,4,8,9,2,6};
        System.out.println(method(arr,4));
    }
}
