package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlaping {

    public static int[][] merge(int[][] intervals){

        List<int[]> result = new ArrayList<>();

        int n = intervals.length;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i=1; i<n; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];

            if (s <= end){
                end = Math.max(e,end);
            }else {
                result.add(new int[]{start,end});
                start =s;
                end=e;
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        System.out.println(Arrays.deepToString(result));
    }
}
