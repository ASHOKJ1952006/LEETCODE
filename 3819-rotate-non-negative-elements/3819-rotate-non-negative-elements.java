class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length, m = 0;
        int[] a = new int[n];
        for (int x : nums) if (x >= 0) a[m++] = x;
        if (m == 0) return nums;
        k %= m;
        for (int i = 0, j = 0; i < n; i++) {
            if (nums[i] >= 0) nums[i] = a[(j++ + k) % m];
        }
        return nums;
    }
}