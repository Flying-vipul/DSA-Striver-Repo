package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class leetcode1631 {


    private final int[] dRows = {-1,0,0,1};
    private final int[] dCols = {0,-1,1,0};
    public int method(int[][] heights){

        int rows = heights.length;
        int cols = heights[0].length;

        int[][] dist = new int[rows][cols];
        for(int[] ele:dist){
            Arrays.fill(ele,Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] -b[0]);
        pq.offer(new int[]{0,0,0});
        dist[0][0] = 0;

        while(!pq.isEmpty()){

            int[] ele = pq.poll();
            int currEffort = ele[0];
            int currRow = ele[1];
            int currCol = ele[2];

            if(currRow == rows -1 && currCol == cols-1) return currEffort;
            if(currEffort > dist[currRow][currCol]) continue;

            for(int i=0;i<4;i++){

                int newRow = currRow + dRows[i];
                int newCol = currCol + dCols[i];

                if(newCol>=0 && newCol < cols && newRow >= 0 && newRow < rows){
                   int diff = Math.max(currEffort,Math.abs(heights[newRow][newCol] - heights[currRow][currCol]));

                   if(diff < dist[newRow][newCol]){
                       dist[newRow][newCol] = diff;
                       pq.offer(new int[]{diff,newRow,newCol});
                   }
                }
            }
        }
        return 0;

    }
}
