package Queues;

import java.util.LinkedList;
import java.util.Queue;


public class RoundFriends {


        public static int Round(int n, int k) {
            Queue<Integer> q = new LinkedList<>();

            // 1. FILL THE QUEUE
            for (int i = 1; i <= n; i++) {
                q.add(i);
            }

            // 2. THE GAME LOOP
            // Run until only 1 person is left
            while (q.size() > 1) {

                // Rotate k-1 times to put the "victim" at the front
                for (int i = 0; i < k - 1; i++) {
                    q.add(q.remove());
                }

                // Eliminate the person at the front (the k-th person)
                q.remove();
            }

            // Return the last survivor
            return q.peek();
        }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
       int ans= Round(9,8);
        System.out.println(ans);
    }

    }
