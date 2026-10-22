package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kSmallestEle {


    //time complexity is O(nlogk)
    public static int method(int[] arr, int k){

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        for (int i=0;i<k;i++){
            maxHeap.add(arr[i]);
        }
        int l=k;

        while (n>l){
            if (maxHeap.peek()>arr[l]){
                maxHeap.remove();
                maxHeap.add(arr[l]);
            }
            l++;
        }
        return maxHeap.poll();
    }

    static void main() {
        int[] arr = {10,3,7,4,8,9,2,6};
        System.out.println(method(arr,4));
    }
}
