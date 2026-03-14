package LeetCodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {

    public static int single(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                int freq = map.get(ele);
                freq++;
                map.put(ele,freq);
            }
        }
        int res = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                res = key;
            }
        }
        return res ;
    }

    static void main() {
        int[] nums ={4,1,2,1,2};

        int result = single(nums);
        System.out.println(result);
    }
}
