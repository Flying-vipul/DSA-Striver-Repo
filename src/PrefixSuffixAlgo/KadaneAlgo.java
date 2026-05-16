package PrefixSuffixAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KadaneAlgo {

    public static int method(int[] arr){

        if (arr.length == 0) return 0;
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
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(method(arr));
    }

}
