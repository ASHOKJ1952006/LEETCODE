class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int strt=nums.length-k;
        int [] res=new int[nums.length];
        int index=0;
        for(int i=strt;i<nums.length;i++){
            res[index++]=nums[i];
        }
        for(int i=0;i<strt;i++){
            res[index++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
        
    }
}