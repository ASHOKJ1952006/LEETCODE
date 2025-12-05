class Solution {
    public int countPartitions(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        return tot%2==0 ? nums.length-1 : 0;
    }
}