class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int product = 1;
        int zeroCount = 0;

        // Step 1: calculate product of non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        // Step 2: build result
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                arr[i] = 0;
            } 
            else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    arr[i] = product;
                } else {
                    arr[i] = 0;
                }
            } 
            else { // zeroCount == 0
                arr[i] = product / nums[i];
            }
        }

        return arr;
    }
}
