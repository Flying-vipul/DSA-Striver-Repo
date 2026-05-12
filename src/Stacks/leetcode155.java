package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode155 {

    static class MinStack {

        long min = Integer.MAX_VALUE;
        Deque<Long> stack ;

        public MinStack() {

            stack = new ArrayDeque<>();

        }

        public void push(int val) {

            if (stack.isEmpty()) {
                stack.push((long)val);
                min = val;
            }else{
                if (val >= min) {
                    stack.push((long)val);
                }else {
                    long newVal = 2L * val - min;
                    stack.push(newVal);
                    min = val;
                }
            }
        }

        public void pop() {

            if (stack.isEmpty()) return;

            long x = stack.peek();
            stack.pop();
            if (x < min) {
                min = 2L *min - x;
            }
        }

        public int top() {
            if (stack.isEmpty()) return -1;
            long x= stack.peek();
            return (int)Math.max(min, x);
        }

        public int getMin() {
            return (int) min;
        }
    }

}
