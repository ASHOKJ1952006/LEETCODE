class Solution {
    public String reverseVowels(String s) {
        // 1️⃣ Collect all vowels in order
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                vowels.append(ch);
            }
        }

        // 2️⃣ Reverse the collected vowels
        vowels.reverse();

        // 3️⃣ Build the result by putting reversed vowels back
        char[] res = s.toCharArray();
        int k = 0; // index for reversed vowels

        for (int i = 0; i < res.length; i++) {
            if (isVowel(res[i])) {
                res[i] = vowels.charAt(k++);
            }
        }

        return new String(res);
    }

    // simple vowel check
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
