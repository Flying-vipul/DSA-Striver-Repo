package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> method(int[] nums){
        List<Integer> result = new ArrayList<>();

        int count1 =0;
        int count2 =0;

        int candi1 = 0;
        int candi2 = 0;

        int n= nums.length;
        for (int j : nums) {

            if (candi1 == j) {
                count1++;
            } else if (candi2 == j) {
                count2++;
            } else if (count1 == 0) {
                candi1 = j;
            } else if (count2 == 0) {
                candi2 = j;
            } else {
                count1--;
                count2--;
            }

        }

        count1 =0;
        count2 =0;
        for (int num : nums){
            if (num == candi1 ){
                count1 ++;
            }else if(num == candi2) {
                count2 ++;
            }
        }

        if (count1 > n/3){
            result.add(candi1);
        }if(count2 > n/3) {
            result.add(candi2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};

        List<Integer> result = method(nums);

        System.out.println(result);
    }

}
