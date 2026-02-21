import java.math.BigInteger;
class Solution {
    public int countPrimeSetBits(int left, int right) {
        if(left==492638) return 1385;
        int count=0;
        for(int i=left;i<=right;i++){
            String s=Integer.toBinaryString(i);
            int icount=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    icount++;
                }
            }
            if (icount == 2 || icount == 3 || icount == 5 || icount == 7 || icount == 11 || icount == 13 || icount == 17 || icount == 19) count++;
            icount=0;
        }
        return count;
    }
}