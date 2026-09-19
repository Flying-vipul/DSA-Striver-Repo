package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    private final int[] dRow = {-1,0,0,1};
    private final int[] dCol = {0,1,-1,0};
    public int minimumEffortPath(int[][] heights){

        int rows = heights.length;
        int cols = heights[0].length;

        int[][] effort = new int[rows][cols];

        for(int[] ele: heights){
            Arrays.fill(ele,Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{0,0,0});
        effort[0][0] = 0;

        while (!pq.isEmpty()){
            int[] current = pq.poll();
            int currEffort = current[0];
            int currRow = current[1];
            int currCol = current[2];

            if (currRow == rows-1 && currCol == cols-1) return currEffort;

            if (currEffort < effort[currRow][currCol]) return currEffort;

            for (int i=0 ; i<4;i++){
                int newRow = currRow + dRow[i];
                int newCol = currCol + dCol[i];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols){

                    int newEffort = Math.max(currEffort,Math.abs(heights[currRow][currCol] - heights[newRow][newCol]));

                    if (newEffort < effort[newRow][newCol]) {
                        effort[newRow][newCol] = newEffort;
                        pq.offer(new int[]{newRow, newCol, newEffort});
                    }
                }
            }
        }
        return 0;
    }

}
