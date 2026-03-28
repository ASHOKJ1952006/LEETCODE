class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] arr=new int[nums1.length + nums2.length];
        int index=0;
        for(int nums:nums1){
            arr[index++]=nums;
        }

        for(int nums:nums2){
            arr[index++]=nums;
        }
        
        Arrays.sort(arr);
        int len=arr.length;
        if(len%2==1){
            return arr[len/2];
        }
        else{
            return (arr[len/2]+arr[(len/2)-1])/2.0;
        }

    }
}