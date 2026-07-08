package GreedyAlgo;

import java.util.Arrays;

public class Nmeetings {


    public int maxMeetings(int[] start, int[] end) {
        //your code goes here
        int n = start.length;
        int[][] meetings = new int[n][2];
        for (int i=0;i<n;i++){
            meetings[i][0] =start[i];
            meetings[i][1] =end[i];
        }
        Arrays.sort(meetings,(a,b) -> a[1] - b[1]);
        int lastTimeMeet =-1;
        int count =0;
        for (int i=0;i<n;i++){
            if (meetings[i][0]>lastTimeMeet){
                count++;
                lastTimeMeet = meetings[i][1];
            }
        }
        return count;

    }
}
