package PrefixSuffixAlgo;

import java.util.Arrays;

public class leetcode238 {

    public static int[] method(int[] arr) {
        int n= arr.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        int pre = 1;
        for (int i=0;i<n;i++){
            res[i] = pre;
            pre *= arr[i];
        }
        int post =1;
        for (int j=n-1;j>=0;j--){
            res[j] *= post;
            post *= arr[j];
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(method(arr)));
    }
}
