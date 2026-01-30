class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
                if(count==1){
                    res[0]=i;
                }else {
                    res[1]=i;
                }
            }
        }
        if(count==1) res[1]=res[0];
        if(count==0) {
            res[0]=-1;
            res[1]=-1;
        }
        return res;
    }
}