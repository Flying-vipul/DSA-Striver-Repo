package BasicMath;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix){

        int visited =101;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row =0, col=0;

        int[][] directions ={{0,1},{1,0},{0,-1},{-1,0}};

        int currentDirections =0 , changedDirections =0;

        List<Integer> ans = new ArrayList<>();
        ans.add(matrix[0][0]);
        matrix[0][0] = visited;

        while(changedDirections < 2){
            while(row + directions[currentDirections][0] >= 0 &&
                    row + directions[currentDirections][0] < rows &&
                    col + directions[currentDirections][1] >=0 &&
                    col + directions[currentDirections][1] <cols &&
                    matrix[row+directions[currentDirections][0]][col + directions[currentDirections][1]]!= visited){
                changedDirections =0;
                row = row + directions[currentDirections][0];
                col =col + directions[currentDirections][1];

                ans.add(matrix[row][col]);
                matrix[row][col] = visited;

            }
            currentDirections = (currentDirections +1)%4;
            changedDirections++;
        }
        return ans;

    }
}
