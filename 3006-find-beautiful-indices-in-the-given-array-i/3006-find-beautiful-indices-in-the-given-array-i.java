import java.util.*;

class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Find all indices of 'a'
        int index = s.indexOf(a);
        while (index != -1) {
            aList.add(index);
            index = s.indexOf(a, index + 1);
        }
        
        // Step 2: Find all indices of 'b'
        index = s.indexOf(b);
        while (index != -1) {
            bList.add(index);
            index = s.indexOf(b, index + 1);
        }
        
        // Step 3: Check beautiful condition
        for (int i : aList) {
            for (int j : bList) {
                if (Math.abs(i - j) <= k) {
                    result.add(i);
                    break; // no need to check further
                }
            }
        }
        
        return result;
    }
}
