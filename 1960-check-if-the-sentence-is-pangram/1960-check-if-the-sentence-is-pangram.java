class Solution {
    public boolean checkIfPangram(String sentence) {
        int []freq=new int[26];
        int index=0;
        for(int i=0;i<sentence.length();i++){
            freq[sentence.charAt(i)-'a']+=1;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                return false;
            }
        }return true;
    }
}