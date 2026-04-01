package MonotonicStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                ans[st.peek()] = i- st.peek();
                st.pop();
            }
            st.push(i);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemperatures(ans);
        System.out.println(Arrays.toString(res));
    }
}
