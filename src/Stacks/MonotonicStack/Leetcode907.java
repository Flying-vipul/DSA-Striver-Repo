package Stacks.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode907 {


    public static int method(int[] arr) {

        int n= arr.length;
        long totalSum = 0;
        long mod = 1_000_000_007;

        int[] left = new int[n];
        int[] right = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        // fill the left array.
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i+1 : i-stack.peek();
            stack.push(i);
        }

        stack.clear();


        // fill the right array
        for (int i=n-1;i>=0;i--) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n-i:stack.peek()-i;
            stack.push(i);
        }

        for (int i=0;i<n;i++) {
            long contributions = (long) left[i] * right[i] % mod;
            totalSum =  (totalSum + contributions * arr[i]) % mod;
        }

        return (int) totalSum;



    }
}
