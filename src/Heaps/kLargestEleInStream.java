package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kLargestEleInStream {

    public static List<Integer> method(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int n = arr.length;
        for (int ele:arr){
            minHeap.add(ele);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while (i<n){
            if (ans.size()<k){
                ans.add(-1);
            }
            ans.add()
            i++;
        }


    }
}
