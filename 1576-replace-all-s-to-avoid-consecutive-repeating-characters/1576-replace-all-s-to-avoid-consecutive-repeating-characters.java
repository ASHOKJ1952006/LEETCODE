class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();

        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == '?') {
                char prev = (i > 0) ? sb.charAt(i - 1) : 0;
                char next = (i < n - 1) ? s.charAt(i + 1) : 0; // use original s for next (may be '?')
                // choose a letter not equal to prev and not equal to next
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c != prev && c != next) {
                        sb.setCharAt(i, c);
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
}
