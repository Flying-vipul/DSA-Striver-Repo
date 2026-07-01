package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeights {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele:stones){
            maxHeap.add(ele);
        }
        while (maxHeap.size()>1){
            int max1= maxHeap.remove();
            int max2 = maxHeap.remove();
            int res = Math.abs(max2-max1);
            maxHeap.add(res);
        }

        return maxHeap.remove();
    }

    static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));

    }
}
