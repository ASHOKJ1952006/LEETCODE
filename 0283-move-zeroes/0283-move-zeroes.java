class Solution {
    public void moveZeroes(int[] nums) {
        int []res=new int[nums.length];
        int index=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[index--]=nums[i];
            }
        }
        index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[index++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
        
    }
}