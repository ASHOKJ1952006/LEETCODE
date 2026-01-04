class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            int lim=nums[i];
            int count=0;
            for(int j=1;j<=lim;j++){
                if(lim%j==0){
                    count++;
                    sum+=j;  
                }
                if(count>4) break;
            }
            if(count==4){
                res+=sum;
                sum=0;
            }else{
                sum=0;
            }
        }
        return res;
    }
}