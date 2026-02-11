class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            int n = -1;   // reset for each element

            // find index of nums1[i] in nums2
            int index = -1;
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }

            // find next greater element
            for(int j = index + 1; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]) {
                    n = nums2[j];
                    break;
                }
            }

            res[i] = n;
        }

        return res;
    }
}
