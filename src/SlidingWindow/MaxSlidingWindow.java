package SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow
{
    public  int[] maxSlide(int[] numArr, int k) {
        if (numArr == null || numArr.length == 0 || k <=0){
            return new int[0];
        }

        int n= numArr.length;
        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[n-k+1];

        for(int i=0; i<n; i++) {

            // This while is for to remove the index from queue which are not in current window from front we remove here.
            while (!deque.isEmpty() && deque.peek() < i-k+1) {
                deque.poll();
            }

            //This while loop is for to remove the less value elements than current iteration from back.
            while (!deque.isEmpty() && numArr[deque.peekLast()] < numArr[i] ){
                deque.pollLast();
            }

            // here we add the index to queue
            deque.offer(i);

            //finally here we do add the element in ans(Array).
            if (i >= k-1) {
                ans[i - k +1] = numArr[deque.peek()];
            }
        }
        return ans;
    }
}
