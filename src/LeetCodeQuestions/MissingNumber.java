package LeetCodeQuestions;

public class MissingNumber {

    public static int missing(int[] nums){
        int k = nums.length;

        int exceptedSum = (k*(k+1)/2);
        int sum =0;
        for (int ele:nums){
            sum+=ele;
        }

        return exceptedSum - sum;

    }

    static void main() {
        int[] nums = {0,2,3,4,5,6,7,1,9};

        int result = missing(nums);
        System.out.println(result);
    }
}
