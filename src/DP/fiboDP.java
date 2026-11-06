package DP;

import java.util.Arrays;
import java.util.List;

public class fiboDP {


    private static int method(int n , int[] arr){

        if(n <=1){
            return n;
        }

        if(arr[n] != -1){
            return arr[n];
        }

        return arr[n] = method(n-1,arr) + method(n-2,arr);
    }

    static void main() {
        int n=4;
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        int ans = method(n,arr);
        System.out.println(ans);
    }
}
