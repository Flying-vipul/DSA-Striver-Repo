package PrefixSuffixAlgo;

public class leetcode1800 {


    public static int method(int[] arr) {
        if (arr.length == 0) return 0;
        int n = arr.length;
        int maxi = arr[0];
        int PrefixMax = arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]>=arr[i-1]){
                PrefixMax+=arr[i];
            }else{
                PrefixMax = arr[i];
            }
            maxi = Math.max(maxi,PrefixMax);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,5,10,50};
        System.out.println(method(arr));
    }
}
