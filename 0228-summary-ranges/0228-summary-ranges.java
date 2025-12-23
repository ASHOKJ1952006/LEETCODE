class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();
        if (nums.length == 0) return arr;

        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            // If end of array OR break in sequence
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {

                if (start == i) {
                    arr.add(String.valueOf(nums[i]));
                } else {
                    arr.add(nums[start] + "->" + nums[i]);
                }

                start = i + 1; // move to next range
            }
        }
        return arr;
    }
}
