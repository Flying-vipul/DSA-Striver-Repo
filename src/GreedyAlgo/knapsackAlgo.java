package GreedyAlgo;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

public class knapsackAlgo {

    public static double method(int[][] arr,int W){
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare((double)b[0]/b[1], (double)a[0]/a[1]));
        maxHeap.addAll(Arrays.asList(arr));
        double ans = 0;
        while(W>0 && !maxHeap.isEmpty()){
            int[] get = maxHeap.poll();
            if (get[1]>W){
                double fet = ((double) get[0]/get[1])*W;
                ans+=fet;
                W-=W;
            }else{
                W-=get[1];
                ans+=get[0];
            }
        }
        return ans;

    }

    static void main() {
        int[][] arr = {{100,20},{60,100},{100,50},{200,50}};
        double ans = method(arr,90);
        System.out.println(ans);
    }
}
