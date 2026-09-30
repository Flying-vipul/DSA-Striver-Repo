package Graphs;

import java.util.*;

public class NoOfDistinctIslands {

    class Pair{
        int row;
        int col;

        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    private final int[] dRows = {1,0,0,-1};
    private final int[] dCols = {0,-1,1,0};
    public int countDistinctIslands(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Set<List> set = new HashSet<>();

        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1){
                   List<String> getList = bfs(i,j,grid);
                   set.add(getList);
                }
            }
        }

        return set.size();
    }


    private List<String> bfs(int row, int col ,int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        List<String> list = new ArrayList<>();
        q.offer(new Pair(row,col));
        grid[row][col] = 0;
        while (!q.isEmpty()){
            Pair currPair = q.poll();
            int currRow = currPair.row;
            int currCol = currPair.col;
            int relativeRow = currRow-row;
            int relativeCol = currCol-col;
            String str = relativeRow + "," + relativeCol;
            list.add(str);
            for(int i=0;i<4;i++){
                int reqRow = currRow - dRows[i];
                int reqCol = currCol - dCols[i];
                if(reqCol>=0&&reqRow>=0 && reqRow<rows&&reqCol<cols && grid[reqRow][reqCol] == 1){
                    q.offer(new Pair(reqRow,reqCol));
                }
            }
        }
        return list;
    }
}
