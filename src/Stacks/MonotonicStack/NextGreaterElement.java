package Stacks.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {


    public static int[] method(int[] input) {
        int n = input.length;

        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i=n-1;i>=0;i--) {
            if (stack.isEmpty()) {
                ans[i]= -1;
                stack.push(input[i]);
            }else{
                if (input[i] < stack.peek()) {
                    ans[i] = stack.peek();
                    stack.push(input[i]);
                }else{
                    while (!stack.isEmpty() && (input[i] >= stack.peek())) {
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

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] input = {4,12,5,3,1,2,5,3,1,2,4,6};

        int[] res=  method(input);
        System.out.println(Arrays.toString(res));

    }
}
