package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class onlineStockSpan {

    public static int[] method(int[] arr) {
        int n= arr.length;
        int[] ans = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();



        for (int i=0;i<n;i++) {
            int count =1;
            while(!stack.isEmpty() && stack.peek()[0]<=arr[i]) {
                count+= stack.pop()[1];
            }
            stack.push(new int[]{arr[i],count});

            ans[i] = count;
        }

        return ans;
//        [100, 80, 60, 70, 60, 75]
    }
}
