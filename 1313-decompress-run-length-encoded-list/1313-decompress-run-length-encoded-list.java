class Solution {
    public int[] decompressRLElist(int[] nums) {
        // First calculate the total size of the output array
        int totalSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalSize += nums[i];
        }

        // Create result array with exact size
        int[] ans = new int[totalSize];
        int ind = 0;

        // Fill the result array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int value = nums[i + 1];

            while (freq > 0) {
                ans[ind++] = value;
                freq--;
            }
        }

        return ans;
    }
}
