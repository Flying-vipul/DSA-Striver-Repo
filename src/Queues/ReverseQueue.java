package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void Reverse(Queue<Integer> q) {

        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i=1; i<=size;i++) {
            int rev=q.remove();
            s.push(rev);
        }

        for (int j=1;j<=size;j++) {
            if(!s.isEmpty()) {
                int rev = s.pop();
                q.add(rev);
            }
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        Reverse(q);
        System.out.println(q);
    }
}
