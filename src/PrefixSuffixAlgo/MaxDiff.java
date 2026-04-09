package PrefixSuffixAlgo;

public class MaxDiff {

    // This is the O(n^2) time complexity
    public static int method(int[] arr) {
        int n = arr.length;

        int maxDiff = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){

            for (int j=i+1;j<n;j++){
                if (arr[j] >= arr[i]){
                    int get = arr[j] - arr[i];
                    maxDiff = Math.max(maxDiff,get);
                }
            }
        }
        return maxDiff;
    }

    // This method optimized way O(n)
//    public static int method2(int[] arr) {
//
//    }


    public static void main(String[] args) {
        int[] arr = {9,5,8,12,2,3,7,4};
        int res = method(arr);
        System.out.println(res);
    }
}
