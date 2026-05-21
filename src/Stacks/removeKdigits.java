package Stacks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class removeKdigits {

    public static List<Integer> method(String str,int k) {
        int n= str.length();

        if (k==n) return new ArrayList<>(0) ;

        List<Integer> stack = new ArrayList<>();

        for (int i=0;i<n;i++) {

                while (!stack.isEmpty() && stack.getLast() > str.charAt(i)-'0' && k>0 ) {
                    stack.removeLast();
                    k--;
                }
            stack.addLast(str.charAt(i)-'0');
            }



        while (k>0) {
            stack.removeLast();
            k--;
        }
        return stack;
    }

    public static void main(String[] args) {
        String input = "1432219";
        List<Integer> ans = method(input,3);
        System.out.println(ans);
    }
}
