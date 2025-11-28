class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index=0;
        int[] res=new int[nums.length];
        for(int num:nums){
            if(num%2==0){
                res[index]=num;
                index++;
            }
        }
        for(int num:nums){
            if(num%2!=0){
                res[index]=num;
                index++;
            }
        }
        return res;
    }
}