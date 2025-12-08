import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] arr = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder();
            
            // Convert each character to morse and add to sb
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);        // 'a' to 'z'
                sb.append(arr[ch - 'a']);        // map to morse using array
            }
            
            // Add the full morse transformation of the word
            set.add(sb.toString());
        }
        
        // Number of unique transformations
        return set.size();
    }
}
