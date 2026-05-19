package Stacks.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement2 {

    public static int[] method(int[] input) {
        int n= input.length;

        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[n];

        for (int i=2*n-1;i>=0;i--){
            int ele = i%n;
            if(i>=n) {

                if (stack.isEmpty()) {
                    stack.push(input[ele]);
                }else{

                while(!stack.isEmpty() && input[ele] >= stack.peek()) {
                    stack.pop();
                }
                    stack.push(input[ele]);
                }
            }else{
                while (!stack.isEmpty() && input[ele] >= stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = -1;
                    stack.push(input[i]);
                }else{
                    ans[i] = stack.peek();
                    stack.push(input[i]);
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }

}
