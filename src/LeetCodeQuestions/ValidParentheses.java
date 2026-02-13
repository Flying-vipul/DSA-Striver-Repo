package LeetCodeQuestions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {

    public static  boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ( (c==')' && top != '(' )||
                        ( c=='}' && top != '{' )||
                        (c==']' && top != '[')){
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
