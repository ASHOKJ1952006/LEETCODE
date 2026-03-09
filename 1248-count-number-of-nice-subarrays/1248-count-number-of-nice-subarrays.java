class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int n = nums.length;

        // prefixOddCount[i] = how many times prefix sum 'i' occurred
        int[] prefixOddCount = new int[n + 1];

        // base case: prefix sum 0 occurs once
        prefixOddCount[0] = 1;

        int oddCount = 0;   // number of odd numbers seen so far
        int result = 0;     // total nice subarrays

        for (int num : nums) {

            // check if current number is odd
            if (num % 2 == 1) {
                oddCount++;
            }

            // if we previously had prefix sum (oddCount - k),
            // then subarray with k odd numbers exists
            if (oddCount - k >= 0) {
                result += prefixOddCount[oddCount - k];
            }

            // record current prefix sum occurrence
            prefixOddCount[oddCount]++;
        }

        return result;
    }
}