import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        ArrayList<String> all = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {
            all.add(str1[i]);
        }
        for (int i = 0; i < str2.length; i++) {
            all.add(str2[i]);
        }
        for (int i = 0; i < all.size(); i++) {

            String current = all.get(i);
            int count = 0;

            for (int j = 0; j < all.size(); j++) {
                if (current.equals(all.get(j))) {
                    count++;
                }
            }

            if (count == 1) {
                res.add(current);
            }
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}