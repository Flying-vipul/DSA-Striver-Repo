package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillBFS {

    class Cordinates{
        int row;
        int col;

        public Cordinates(int row, int col){
            this.row = row;
            this.col = col;
        }
    }



    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc] == color) return image;
        int rows = image.length;
        int cols = image[0].length;


        Queue<Cordinates> queue = new LinkedList<>();

        queue.offer(new Cordinates(sr,sc));

        int saveColor = image[sr][sc];
        image[sr][sc] = color;

        while(!queue.isEmpty()){

            Cordinates getCurr = queue.poll();
            int currRow = getCurr.row;
            int currCol = getCurr.col;

            if(currRow-1 >=0 && saveColor == image[currRow-1][currCol]){
                queue.offer(new Cordinates(currRow-1,currCol));
                image[currRow-1][currCol] = color;
            }

            if(currRow+1 <rows && saveColor == image[currRow+1][currCol]){
                queue.offer(new Cordinates(currRow+1,currCol));
                image[currRow+1][currCol] = color;
            }

            if(currCol-1 >=0 && saveColor == image[currRow][currCol-1] ){
                queue.offer(new Cordinates(currRow,currCol-1));
                image[currRow][currCol-1] = color;
            }

            if(currCol+1 <cols && saveColor == image[currRow][currCol+1]  ){
                queue.offer(new Cordinates(currRow,currCol+1));
                image[currRow][currCol+1] = color;
            }
        }

        return image;
    }
}
