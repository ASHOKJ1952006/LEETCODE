import java.util.*;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];     // supports all ASCII chars
        int[] original = new int[256]; // store original freq
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        // count frequency for every ASCII char
        for (char c : chars) {
            freq[c]++;
            original[c]++;
        }

        // sort the frequency array
        Arrays.sort(freq);   // sorted ascending

        // build result from highest freq → lowest
        for (int i = 255; i >= 0; i--) {
            int f = freq[i];
            if (f == 0) break; // remaining are zeros

            // find all characters whose original frequency = f
            for (int ch = 0; ch < 256; ch++) {
                if (original[ch] == f) {

                    // append that character f times
                    for (int k = 0; k < f; k++) {
                        sb.append((char) ch);
                    }

                    // mark as used
                    original[ch] = -1;
                }
            }
        }

        return sb.toString();
    }
}
