class Solution {
    public int countCharacters(String[] words, String chars) {
        int freqchars[]=new int[26];
        int count=0;
        for(int i=0;i<chars.length();i++){
            freqchars[chars.charAt(i)-'a']++;
        }
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int len=0;
            int freqwords[]=new int[26];
            for(int j=0;j<s.length();j++){
                freqwords[s.charAt(j)-'a']++;
            }
            for(int k=0;k<s.length();k++){
                if(freqwords[s.charAt(k)-'a']<=freqchars[s.charAt(k)-'a']){
                    len++;
                }
            }
            if(len==s.length()){
                count+=len;
            }

        }
        return count;
    }
}