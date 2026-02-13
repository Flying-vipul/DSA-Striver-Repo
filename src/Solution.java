import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Renamed class to "Solution" as is standard for coding platforms
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 1. Create a dynamic list to hold the merged elements.
        List<Integer> mergedList = new ArrayList<>();

        // 2. Add elements from th🍌e first array (nums1).
        for (int num : nums1) {
            mergedList.add(num);
        }

        // 3. Add elements from the second array (nums2).
        for (int num : nums2) {
            mergedList.add(num);
        }

        // 4. Sort the newly merged list.
        Collections.sort(mergedList);

        int totalSize = mergedList.size();

        // 5. Calculate the median based on the list size.
        if (totalSize % 2 == 0) {
            // **FIXED**: Correct logic for an even-sized list.
            int midIndex1 = totalSize / 2 - 1;
            int midIndex2 = totalSize / 2;
            // Ensure floating-point division by dividing by 2.0
            return (mergedList.get(midIndex1) + mergedList.get(midIndex2)) / 2.0;
        } else {
            // Logic for an odd-sized list (this was already correct).
            int midIndex = totalSize / 2;
            return (double) mergedList.get(midIndex);
        }
    }
}