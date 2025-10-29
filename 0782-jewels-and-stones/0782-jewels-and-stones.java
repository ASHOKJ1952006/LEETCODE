class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] jwls=jewels.toCharArray();
        char[] stns=stones.toCharArray();
        for(int i=0;i<stns.length;i++){
            for(int j=0;j<jwls.length;j++){
                if(stns[i]==jwls[j]){
                    count++;
                }
            }
        }
        return count;
    }
}