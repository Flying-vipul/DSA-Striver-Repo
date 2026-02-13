package LeetCodeQuestions;

import java.util.*;

public  class NxtGreaterEle {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int k = nums1.length;
        int[] ans = new int[n];
        int[] result = new int[k];
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = n-1; i>=0;i--){
            while(stack.size() >0 && stack.peek() <= nums2[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.pop();
            }
            stack.push(nums2[i]);

            map.put(nums2[i],ans[i]);
        }
       for(int l =0; l< k;l++){
          if( map.containsKey(nums1[l])){
              int res = map.get(nums1[l]);
              result[l] = res;
          }
       }
       return result;
    }

    public static int[] nxtGreat(int[] great) {
        int n = great.length;
        int[] ans = new int[n];

        // ArrayDeque is stack in java .
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = n-1; i>=0; i--) {
            while(stack.size() >0 && stack.peek() <= great[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
               ans[i] = -1;
            }else{
                ans[i] = stack.pop();
            }

            stack.push(great[i]);
        }
        return ans;
    }

    static void main() {
        int[] great = {6,8,0,1,3};

       int[] ans = nxtGreat(great);

        System.out.println(Arrays.toString(ans));

        int[] nums1= {4,1,2};
        int[] nums2 = {1,3,4,2};

       int[] result =  nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
