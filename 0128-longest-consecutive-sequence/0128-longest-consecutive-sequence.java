class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return 1;
        int count=1;
        int res=0;
        int copy=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){ 
                copy++;
            }
            else if(nums[i]+1==nums[i+1]){
                count++;
                copy=0;
            }else{
                count=1;
                copy=0;
            }
            
            res=Math.max(res,count);
            
        }
        return res;

    }
}