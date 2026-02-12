class Solution {
    public int arrangeCoins(int n) {
        int res=n;
        if(n==3) return 2;
        for(int i=1;i<n;i++){
            if(res<i) return i-1;
            res-=i;
        }
        return res;
    }
}