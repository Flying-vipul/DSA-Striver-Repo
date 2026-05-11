package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class validparenthese1 {


    public static boolean isValid(String s){


        Deque<Character> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if (c == '('|| c=='{' || c=='['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (top=='(' && c!=')' || top=='{' && c!='}' || top=='[' && c!=']' ){
                    return false;
                }
            }
        }

        return stack.isEmpty();


    }

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }
}
