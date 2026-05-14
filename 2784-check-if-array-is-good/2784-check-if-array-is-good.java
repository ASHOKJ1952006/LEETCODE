class Solution {
    public boolean isGood(int[] nums) {
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(maxx < nums[i]){
                maxx=nums[i];
            }
        }
        if(nums.length!=maxx+1){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<maxx;i++){
            if(i+1 != nums[i]){
                return false;
            }
        }
        return nums[maxx]==maxx;
    }
}