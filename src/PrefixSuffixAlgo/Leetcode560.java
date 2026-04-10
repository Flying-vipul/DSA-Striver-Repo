package PrefixSuffixAlgo;

import java.util.HashMap;

public class Leetcode560 {

    public static int method(int[] arr, int k) {

        if (arr.length == 0) return 0;
        int count = 0;
        int prefix = arr[0];
        for (int i=0;i< arr.length;i++){

            prefix =0;

            for (int j=i;j< arr.length;j++){
                prefix+=arr[j];
                if (prefix == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int method2(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int currSum = 0;
        int count =0;
        for (int i=0;i< arr.length;i++){
            currSum+=arr[i];
            int target = currSum - k;
            if (map.containsKey(target)){
                count+= map.get(target);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(method2(arr,2));
    }
}
