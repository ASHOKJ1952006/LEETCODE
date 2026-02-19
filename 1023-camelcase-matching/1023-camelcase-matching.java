import java.util.*;

class Solution {
    
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        
        List<Boolean> result = new ArrayList<>();
        
        for (String query : queries) {
            
            int j = 0;
            boolean match = true;
            
            for (int i = 0; i < query.length(); i++) {
                
                char ch = query.charAt(i);
                
                // If character matches pattern
                if (j < pattern.length() && ch == pattern.charAt(j)) {
                    j++;
                }
                // If uppercase letter doesn't match → invalid
                else if (Character.isUpperCase(ch)) {
                    match = false;
                    break;
                }
            }
            
            // Pattern must be fully matched
            if (j != pattern.length()) {
                match = false;
            }
            
            result.add(match);
        }
        
        return result;
    }
}
