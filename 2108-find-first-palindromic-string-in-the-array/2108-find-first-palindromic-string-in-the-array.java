class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<words.length;i++){
            String s=words[i];
            StringBuilder check=new StringBuilder();
            for(int j=s.length()-1;j>=0;j--){
                check.append(s.charAt(j));
            }
            if(s.equals(check.toString())) return s;

        }
        return "";

    }
}