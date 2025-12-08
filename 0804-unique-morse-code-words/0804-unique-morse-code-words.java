class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet <String> set=new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            String word=words[i];
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                sb.append(arr[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();

    }
}