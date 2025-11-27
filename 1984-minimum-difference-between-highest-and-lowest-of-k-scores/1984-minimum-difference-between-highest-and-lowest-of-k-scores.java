import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;  // Only one student -> difference is 0

        Arrays.sort(nums);    // Step 1: Sort the array

        int min = Integer.MAX_VALUE;

        // Step 2 & 3: Sliding window of size k
        for (int i = 0; i + k - 1 < nums.length; i++) {
            int diff = nums[i + k - 1] - nums[i];  // max - min in window
            min = Math.min(min, diff);             // Update smallest difference
        }

        return min;  // Step 4: Return answer
    }
}
