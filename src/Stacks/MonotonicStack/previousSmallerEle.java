package Stacks.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class previousSmallerEle {

    public static int[] method(int[] input) {
        int n= input.length;

        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[n];

        for (int i=0;i<n;i++){

            if (stack.isEmpty()) {
                ans[i] =-1;
                stack.push(input[i]);
            }else{
                while(!stack.isEmpty() && input[i] <= stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = -1;
                    stack.push(input[i]);
                }else {
                    ans[i] = stack.peek();
                    stack.push(input[i]);
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] input ={4,5,2,10,8};
        int[] ans = method(input);
        System.out.println(Arrays.toString(ans));
    }
}
