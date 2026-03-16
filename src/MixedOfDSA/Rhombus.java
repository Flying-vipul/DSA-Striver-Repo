package MixedOfDSA;

import java.util.Iterator;
import java.util.TreeSet;

public class Rhombus {

    public static int[] method(int[][] grid){

        int rows = grid.length;
        int cols = grid[0].length;

        TreeSet<Integer> t3 = new TreeSet<>();
        for (int r=0;r< rows;r++){
            for (int c=0;c< cols ;c++){

                int L = 0;

                while (c - L>=0 && c+L< cols && r+2*L<rows){
                    int currentSum =0;

                    if(L==0){
                        currentSum =grid[r][c];
                    }else{

                        int currR = r;
                        int currC = c;

                        // Walk Down-Right
                        for (int i = 0; i < L; i++) {
                            currentSum += grid[currR][currC];
                            currR++; currC++;
                        }
                        // Walk Down-Left
                        for (int i = 0; i < L; i++) {
                            currentSum += grid[currR][currC];
                            currR++; currC--;
                        }
                        // Walk Up-Left
                        for (int i = 0; i < L; i++) {
                            currentSum += grid[currR][currC];
                            currR--; currC--;
                        }
                        // Walk Up-Right (Back to the Top Anchor)
                        for (int i = 0; i < L; i++) {
                            currentSum += grid[currR][currC];
                            currR--; currC++;
                        }
                    }

                    t3.add(currentSum);
                    if (t3.size() > 3){
                        t3.pollFirst();
                    }

                L++;
                }
            }
        }
        int[] result = new int[t3.size()];

        int index=0;
        Iterator<Integer> it = t3.descendingIterator();
        while(it.hasNext()) {
            result[index++] = it.next();
        }

        return result;
    }
}
