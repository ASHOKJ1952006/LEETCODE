

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        // Step 1: Calculate total apples
        int asum = 0;
        for (int a : apple) {
            asum += a;
        }

        // Step 2: Sort capacities in descending order
        Arrays.sort(capacity);

        int tot = 0;
        int count = 0;

        // Step 3: Pick boxes with largest capacity first
        for (int i = capacity.length - 1; i >= 0; i--) {
            tot += capacity[i];
            count++;

            if (tot >= asum) {
                return count;
            }
        }

        return count;
    }
}
