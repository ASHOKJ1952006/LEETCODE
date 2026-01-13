import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] env) {

        // Step 1: Sort
        Arrays.sort(env, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1]; // height desc for same width
            return a[0] - b[0];
        });

        // Step 2: LIS on height
        int[] dp = new int[env.length];
        int len = 0;

        for (int i = 0; i < env.length; i++) {
            int h = env[i][1];

            int idx = Arrays.binarySearch(dp, 0, len, h);
            if (idx < 0) idx = -(idx + 1);

            dp[idx] = h;
            if (idx == len) len++;
        }

        return len;
    }
}
