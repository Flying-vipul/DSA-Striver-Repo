package BasicMath;

public class GameOfLife {

    public void gameOfLife(int[][] board) {

        int[] neigh = {0,1,-1};
        int rows = board.length;
        int cols = board[0].length;

        for (int row=0;row<rows;row++){
            for (int col=0;col<cols;col++){
                int liveNeigh = 0 ;

                for (int i=0;i<3;i++){
                    for (int j=0;j<3;j++){
                        if (!(neigh[i]==0 && neigh[j]==0)){
                            int r=(row+neigh[i]);
                            int c = (col+neigh[j]);

                            if((r<rows && r>=0) && (c<cols && c>=0) && (Math.abs(board[r][c])==1)){
                                liveNeigh++;

                            }
                        }
                    }


                }

                if ((board[row][col] ==1)&&(liveNeigh<2 || liveNeigh>3) ){
                    board[row][col] = -1;

                }
                if ((board[row][col] ==0) && (liveNeigh == 3)){
                    board[row][col] =2;
                }
            }

        }
        for (int row =0;row<rows;row++){
            for (int col =0; col<cols;col++){
                if (board[row][col]>0){
                    board[row][col]=1;
                }else{
                    board[row][col]=0;
                }
            }
        }

    }
}
