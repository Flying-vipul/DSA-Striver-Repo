package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode150 {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for(String token:tokens){
            if (token.equals("+")) {
                // It's a plus operator! Pop two numbers and add them.
                int a = stack.pop();
                int b= stack.pop();
                int ans= b+a;
                stack.push(ans);
            }
            else if (token.equals("-")) {
                // It's a minus operator! Pop two numbers and subtract them.
                int a = stack.pop();
                int b= stack.pop();
                int ans= b-a;
                stack.push(ans);

            }
            else if (token.equals("*")) {
                // It's a multiply operator! Pop two numbers and multiply.
                int a = stack.pop();
                int b= stack.pop();
                int ans= b*a;
                stack.push(ans);

            }
            else if (token.equals("/")) {
                // It's a divide operator! Pop two numbers and divide.

                int a = stack.pop();
                int b= stack.pop();
                int ans= b/a;
                stack.push(ans);

            }
            else {
                // If it is NOT any of the 4 operators above, it MUST be a number!
                // Convert the string to an integer and push it to the stack:
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }

        return stack.pop();
    }
}
