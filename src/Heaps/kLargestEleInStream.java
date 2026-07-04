package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kLargestEleInStream {

    public static List<Integer> method(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while (i<n){
            minHeap.add(arr[i]);


            if (minHeap.size()>k){
                minHeap.remove();
            }

            if (minHeap.size()<k){
                ans.add(-1);
            }else {
                ans.add(minHeap.peek());
            }
            i++;
        }
        return ans;
    }

    static void main() {
        int[] arr = {2,5,6,9,8,7};
        System.out.println(method(arr,4));
    }
}
