package Heaps;

import java.util.PriorityQueue;

public class ll215 {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num:nums){
            minHeap.add(num);
            if (minHeap.size()>k){
                minHeap.poll();
            }
        }
        return  minHeap.poll();
    }
}
