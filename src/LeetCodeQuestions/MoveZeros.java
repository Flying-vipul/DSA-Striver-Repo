package LeetCodeQuestions;

public class MoveZeros {


        public void moveZeroes(int[] nums) {
            int insertIndex = 0; // The Builder

            // TODO: Write the loop where Scout (i) finds non-zeros
            // and gives them to insertIndex.
            for (int i=0 ;i<= nums.length-1;i++) {
                if (nums[i] != 0) {
                    nums[insertIndex] = nums[i];
                    insertIndex ++;
                }
            }
            for (int j = insertIndex; j<= nums.length-1;j++) {
                nums[j] = 0;
            }
    }
}
