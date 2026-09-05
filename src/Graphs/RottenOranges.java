package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {


    class Cordinates{
        int row;
        int col;

        public Cordinates(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    class Pair{
        Cordinates cord;
        int time;

        public Pair(Cordinates cord, int time){
            this.cord = cord;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;

        Queue<Pair> queue = new LinkedList<>();
        boolean[][] isVisited = new boolean[rows][cols];
        int time = 0;

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(grid[i][j] == 2){
                    queue.offer(new Pair(new Cordinates(i,j),time));
                }
            }
        }

        while (!queue.isEmpty()){
            Pair getCurr = queue.poll();
            int currRow = getCurr.cord.row;
            int currCol = getCurr.cord.col;
            int currTime = getCurr.time;

            ans = Math.max(ans, currTime);

            if(currRow-1 >= 0&& grid[currRow-1][currCol] == 1){
                queue.offer(new Pair(new Cordinates(currRow-1,currCol),currTime+1));
                grid[currRow-1][currCol] = 2;
            }

            if(currRow+1 < rows  && grid[currRow+1][currCol] == 1){
                queue.offer(new Pair(new Cordinates(currRow+1,currCol),currTime+1));
                grid[currRow+1][currCol] = 2;
            }

            if(currCol-1 >= 0 && grid[currRow][currCol-1] == 1){
                queue.offer(new Pair(new Cordinates(currRow,currCol-1),currTime+1));
                grid[currRow][currCol-1] = 2;
            }

            if(currCol+1 < cols &&  grid[currRow][currCol+1] == 1){
                queue.offer(new Pair(new Cordinates(currRow, currCol+1),currTime+1));
                grid[currRow][currCol] = 2;
            }
        }

        for (int[] ints : grid) {
            for (int j = 0; j < cols; j++) {
                if (ints[j] == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }
}
