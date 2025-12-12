class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] res=new int[nums.length];
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<nums.length;i++){
            arr2[j]=nums[i];
            j++;
        }
        int index=0;
        for(int i=0;i<n;i++){
            res[index++]=arr1[i];
            res[index++]=arr2[i];
        }
        return res;
        
    }
}