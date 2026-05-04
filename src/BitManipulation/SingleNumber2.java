package BitManipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber2 {

    public static int method(int[] nums) {
        int n= nums.length;

        Arrays.sort(nums);

        for (int i=1;i< n;i+=3){
            if (nums[i-1] != nums[i]){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }

    public static void main(String[] args) {
        int[] nums ={0,1,0,1,0,1,99};
        int res = method(nums);
        System.out.println(res);
    }
}
