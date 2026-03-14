package LeetCodeQuestions;

public class MaxConsecutiveOnes {

    public static int ones(int[] nums){
        int currCounter = 0;
        int maxCounter = 0;

        for (int ele:nums){
            if (ele == 1){
                currCounter+=1;
            }else{
                if (maxCounter < currCounter){
                maxCounter = currCounter;
                }
                currCounter =0;
            }
        }
       return Math.max(maxCounter,currCounter);

    }

    static void main() {
        int[] nums ={1,1,1,1,1,1};

        int result = ones(nums);
        System.out.println(result);
    }
}
