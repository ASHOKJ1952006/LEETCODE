class Solution {
    public String removeDuplicateLetters(String s) {

        boolean[] present = new boolean[26];
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            freq[idx]--;
            if (present[idx]) continue;
            while (sb.length() > 0) {
                char last = sb.charAt(sb.length() - 1);
                if (last > c && freq[last - 'a'] > 0) {
                    present[last - 'a'] = false;
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    break;
                }
            }

            sb.append(c);
            present[idx] = true;
        }

        return sb.toString();
    }
}
