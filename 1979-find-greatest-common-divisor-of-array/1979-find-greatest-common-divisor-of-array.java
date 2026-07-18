class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small) small=nums[i];
            if(nums[i]>big) big=nums[i];
        }
        int res=Integer.MIN_VALUE;
        int temp=0;
        for(int i=1;i<=small;i++){
            if(small%i==0 && big%i==0){
                temp=i;
            }
            res=Math.max(res,temp);
        }
        return res;

    }
}