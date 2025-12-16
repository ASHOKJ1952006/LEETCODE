class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        boolean[] used = new boolean[m.length];

        int count = 0;

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (r[i] == m[j] && !used[j]) {
                    used[j] = true;   // mark magazine char as used
                    count++;
                    break;
                }
            }
        }

        return count == r.length;
    }
}
