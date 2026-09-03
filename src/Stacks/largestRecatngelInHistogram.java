package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class largestRecatngelInHistogram {

    public static int method(int[] arr) {
        int n = arr.length;

        Deque<Integer> stack = new ArrayDeque<>();
        int maxAns = 0;
        int nse=0;
        int pse=0;
        int ele=0;

        for (int i=0;i<n;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                ele = stack.pop();
                nse = i;
                pse = stack.isEmpty()?-1:stack.peek();
                maxAns = Math.max(arr[ele] *(nse-pse-1),maxAns);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            nse = n;
            ele = stack.peek();
            stack.pop();
            pse = stack.isEmpty()?-1:stack.peek();
            maxAns = Math.max(maxAns,(nse-pse-1)*arr[ele]);

        }

        return maxAns;


    }
}

