package PrefixSuffixAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class KadaneAlgo {

    public static int method(int[] arr){

        if (arr.length == 0) return 0;
        int n= arr.length;
        int[] res = new int[n];
        int prefix =0;
        int maxi = Integer.MIN_VALUE;
        for (int j : arr) {
            prefix += j;
            maxi = Math.max(maxi, prefix);

            if (prefix < 0) prefix = 0;
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-5,8,-12,7,6,-2};

        System.out.println(method(arr));
    }

}
