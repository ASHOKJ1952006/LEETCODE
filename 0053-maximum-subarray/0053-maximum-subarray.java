class Solution {
    public int maxSubArray(int[] nums) {
        int tot=0;
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            if(tot<0) tot=0;
            tot+=nums[i];
            res=Math.max(tot,res);
        }
        return res;
    }
}