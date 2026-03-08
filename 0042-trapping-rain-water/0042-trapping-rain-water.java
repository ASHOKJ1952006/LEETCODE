class Solution {
    public int trap(int[] h) {
        int left=0;
        int right=h.length-1;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        int ans=0;
        while(left<right){
            lmax=Math.max(lmax,h[left]);
            rmax=Math.max(rmax,h[right]);
            ans+=(lmax<rmax)?lmax-h[left++]:rmax-h[right--];
        }
        return ans;
    }
}