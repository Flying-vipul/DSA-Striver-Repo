package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber1 {



    public static int[] method(int[] nums) {
        int n= nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        for (int ele:nums){
            if (!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                int freq = map.get(ele);
                freq++;
                map.put(ele,freq);
            }

        }

        ArrayList<Integer> res = new ArrayList<>();
        for (Integer key : map.keySet()){
            if (map.get(key) == 1){
                res.add(key);
            }
        }

        // Convert ArrayList<Integer> to int[] to match the return type
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
