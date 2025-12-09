class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        
        // store all possible odd lengths in this array
        int[] odd = new int[n];
        int ind = 0;
        for (int len = 1; len <= n; len++) {
            if (len % 2 != 0) {          // odd length
                odd[ind++] = len;
            }
        }

        int sum = 0;

        // for each odd length
        for (int i = 0; i < ind; i++) {
            int len = odd[i];

            // move a window of size "len" over the array
            for (int start = 0; start + len <= n; start++) {
                int curr = 0;

                // sum the elements of this subarray [start, start+len-1]
                for (int j = start; j < start + len; j++) {
                    curr += arr[j];
                }

                sum += curr; // add this subarray sum to answer
            }
        }

        return sum;
    }
}
