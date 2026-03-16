package Recursion.Backtracking;

public class RatInMaze2Directions {

    public static int maze(int sr, int sc, int er, int ec) {

        if (sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;
        int downWays = maze(sr+1,sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);
        return downWays + rightWays;
    }

    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int res = maze(1,1,rows,cols);
        System.out.println(res);
    }

}



