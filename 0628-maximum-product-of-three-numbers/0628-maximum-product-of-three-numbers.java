class Solution {
    public int maximumProduct(int[] nums) {
        // int prod=1;
        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;j<nums.length;j++){
        //             int mul=nums[i]*nums[j];
        //             mul*=nums[k];
        //             prod=Math.max(mul,prod);
        //         }
        //     }
        // }
        // return prod;
  
        Arrays.sort(nums);
        int n = nums.length;
        
        // Case 1: Three largest numbers
        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        
        // Case 2: Two smallest (negative) and largest
        int option2 = nums[0] * nums[1] * nums[n-1];
        
        return Math.max(option1, option2);
 


    }
}