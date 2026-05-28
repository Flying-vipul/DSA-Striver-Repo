package SlidingWindow;

public class ll930 {



        // Main method
        public static int numSubarraysWithSum(int[] nums, int goal) {
            // Exact(goal) = AtMost(goal) - AtMost(goal - 1)
            return atMost(nums, goal) - atMost(nums, goal - 1);
        }

        // Helper method
        private static int atMost(int[] nums, int goal) {
            int n= nums.length;
            // Edge case: if goal is negative, it's impossible for a binary array
            if (goal < 0) return 0;

            int i = 0;
            int j = 0;
            int sum = 0;
            int count = 0;

            while (j <n) {
                // 1. Add nums[j] to the sum
                sum+=nums[j];

                // 2. While sum > goal, subtract nums[i] from sum and move 'i' forward
                while(sum>goal){
                    sum-=nums[i];
                    i++;
                }

                // 3. Add the size of the valid window to your count: count += (j - i + 1)
                count+=(j-i+1);

                // 4. Move 'j' forward
                j++;
            }

            return count;
        }

    static void main() {
        int[] arr = {1,0,1,0,1};
        int res = numSubarraysWithSum(arr,2);
        System.out.println(res);
    }
    }

