class Solution {
    public int repeatedNTimes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==nums.length/2) return nums[i];
            count=0;
        }
        return -1;
    }
}