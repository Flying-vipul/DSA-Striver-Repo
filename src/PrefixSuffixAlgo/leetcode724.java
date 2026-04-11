package PrefixSuffixAlgo;

public class leetcode724 {

    public static int method(int[] arr) {
        int totalSum = 0;
        for (int ele:arr){
            totalSum+=ele;
        }

        int leftSum =0;
        for (int i=0;i< arr.length;i++){
            if (leftSum == (totalSum-leftSum-arr[i])){
                return i;
            }

            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1,7,3,6,5,6};

        int res = method(arr);
        System.out.println(res);
    }
}
