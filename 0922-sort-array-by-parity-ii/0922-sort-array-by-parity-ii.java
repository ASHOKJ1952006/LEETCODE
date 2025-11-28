class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res =new int[nums.length];
        int index=0;
        for(int num:nums){
            if(num%2==0){
                res[index]=num;
                index=index+2;
            }
        }
        index=1;
        for(int num:nums){
            if(num%2!=0){
                res[index]=num;
                index=index+2;
            }
        }return res;
    }
}