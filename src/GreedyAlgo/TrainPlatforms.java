package GreedyAlgo;

import java.util.Arrays;

public class TrainPlatforms {

    public static int method(int[] arr, int[] dept){
        Arrays.sort(arr);
        Arrays.sort(dept);
        int i=0;int j=0;
        int platforms = 0;
        int maxPlatforms = 0;
        while(i<arr.length && j<dept.length) {

            if (arr[i]<=dept[j]){
                platforms++;
                maxPlatforms = Math.max(maxPlatforms,platforms);
                i++;
            }else{
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
