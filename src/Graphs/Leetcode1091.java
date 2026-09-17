package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode1091 {

    private final int[] dRow = {-1,-1,-1,0,0,1,1,1};
    private final int[] dCol = {-1,0,1,-1,1,-1,0,1};
    public int shortestPathBinaryMatrix(int[][] grid) {

        int V = grid.length;

        if(grid[0][0] == 1 || grid[V-1][V-1] == 1) return -1;

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0,0,1});
        grid[0][0] =1;

        while (!q.isEmpty()){

            int[] getCurr = q.poll();

            int currRow = getCurr[0];
            int currCol = getCurr[1];
            int currPath = getCurr[2];

            if(currRow == V-1 && currCol == V-1) return currPath;

            for (int i=0;i<8 ; i++){

                int row = currRow + dRow[i];
                int col = currCol + dCol[i];

                if (row >= 0 &&  row < V && col >= 0 && col <= V && grid[row][col] == 0 ){
                    grid[row][col] = 1;
                    q.offer(new int[]{row, col ,currPath+1});
                }
            }
        }

        return -1;

    }
}
