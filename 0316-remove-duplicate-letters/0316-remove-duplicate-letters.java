class Solution {
    public String removeDuplicateLetters(String s) {

        boolean[] chk = new boolean[26];   // same as your chk
        int[] freq = new int[26];          // you already had this

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            // decrease freq
            freq[idx]--;

            // if already taken, skip
            if (chk[idx]) continue;

            // 🔥 main fix: maintain lexicographical order
            while (sb.length() > 0 &&
                   sb.charAt(sb.length() - 1) > c &&
                   freq[sb.charAt(sb.length() - 1) - 'a'] > 0) {

                chk[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            chk[idx] = true;
        }

        return sb.toString();
    }
}