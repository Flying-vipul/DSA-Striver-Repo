package Stacks.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SubArrayRanges {


    public static int method(int[] arr) {


        int n= arr.length;
        int largest = 0;
        int smallest =0;
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i=0;i<n;i++){

            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                largest+=arr[i];
            }else {
                largest += Math.max(arr[i],arr[stack.peek()]);
            }
            stack.push(i);
        }

        stack.clear();

        for (int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                smallest+=arr[i];
            }else {
                smallest += Math.min(arr[i],arr[stack.peek()]);
            }
            stack.push(i);
        }

        return largest-smallest;
    }

    public static void main(String[] args) {
        int[] input = {1,4,3,2};
        int res = method(input);
        System.out.println(res);

    }
}
