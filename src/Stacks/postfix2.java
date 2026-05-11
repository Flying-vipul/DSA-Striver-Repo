package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class postfix2 {

    public static int precedence(char ch) {

        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static String method(String str) {

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();

        for (char c: str.toCharArray()){

            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while(!stack.isEmpty() && stack.peek()=='(') {
                    ans.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                    ans.append(stack.pop());
                }
                stack.push(c);
            }

        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        String ans = method(str);
        System.out.println(ans);
    }
}
