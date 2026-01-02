class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int maxreach=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            maxreach=Math.max(maxreach,i+nums[i]);

            if(i==curr) {
                jump++;
                curr=maxreach;
            }
        }
        return jump;
        
    }
}