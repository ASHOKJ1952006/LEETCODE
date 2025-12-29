class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int[] res = new int[n];

        // Step 1: initialize everyone with 1 candy
        for (int i = 0; i < n; i++) {
            res[i] = 1;
        }

        // Step 2: left to right (fix increasing order)
        for (int i = 1; i < n; i++) {
            if (r[i] > r[i - 1]) {
                res[i] = res[i - 1] + 1;
            }
        }

        // Step 3: right to left (fix decreasing order)
        for (int i = n - 2; i >= 0; i--) {
            if (r[i] > r[i + 1]) {
                res[i] = Math.max(res[i], res[i + 1] + 1);
            }
        }

        // Step 4: sum the candies
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += res[i];
        }

        return sum;
    }
}
