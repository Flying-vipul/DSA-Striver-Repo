package LeetCodeQuestions;

public class MajorityElementI {

    public static int major(int[] nums){

        int n= nums.length;

        int candi = nums[0];
        int count =0;

        for (int i=0; i<n; i++){
            if (count == 0){
                candi = nums[i];
                count++;
            } else if (candi == nums[i]) {
                count ++;
            }else{
                count--;
            }
        }

        return candi;
    }

    public static void main(String[] args) {
        int[] nums ={3,2,2,2,2,3};
        int res = major(nums);
        System.out.println(res);
    }
}
