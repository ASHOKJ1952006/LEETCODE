class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] res=new int[nums.length*2];
        int index=0;
        for(int i:nums){
            res[index++]=i;
        }
        for(int i:nums){
            res[index++]=i;
        }
        return res;
    }
}