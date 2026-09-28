package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class ll862 {

    public int shortestSubarray(int[] nums, int k) {


        int n = nums.length;

        long[] prefixSum = new long[n+1];

        for(int i=1;i<n+1;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }

        Deque<Integer> dq = new ArrayDeque<>();
        int min = Integer.MAX_VALUE;

        int j=0;
        while(j<=n){

            while(!dq.isEmpty() && prefixSum[j] - prefixSum[dq.peekFirst()]>=k){
                min = Math.min(min,j-dq.peekFirst());
                dq.pollFirst();
            }

            while(!dq.isEmpty()&&prefixSum[dq.peekLast()] >= prefixSum[j]){
                dq.pollLast();
            }
            dq.offerLast(j);
            j++;

        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
