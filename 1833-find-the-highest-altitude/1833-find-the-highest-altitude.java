class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;      // highest altitude seen, start includes altitude 0
        int altitude = 0; // current altitude, starts at 0

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];        // move to next altitude
            if (altitude > max) {
                max = altitude;        // update maximum if higher
            }
        }

        return max;
    }
}
