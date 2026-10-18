package Graphs;

import java.util.Arrays;

public class KStopsFlight {


    public int method(int n, int[][] flights, int src, int dst, int k) {

        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;
        for (int i = 0; i <= k; i++) {

            int[] temp = Arrays.copyOf(prices, n);

            for (int[] ele : flights) {
                int currSrc = ele[0];
                int currDest = ele[1];
                int currPrice = ele[2];

                if (prices[currSrc] == Integer.MAX_VALUE) continue;

                if (currPrice + prices[currSrc] < temp[currDest]) {
                    temp[currDest] = currPrice + prices[currSrc];
                }
                prices = temp;
            }
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}
