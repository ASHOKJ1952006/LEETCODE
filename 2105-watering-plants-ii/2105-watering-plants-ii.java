class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        
        int i = 0, j = plants.length - 1;
        int canA = capacityA, canB = capacityB;
        int refill = 0;
        
        while (i <= j) {
            
            if (i == j) {  // same plant
                if (canA >= canB) {
                    if (canA < plants[i]) refill++;
                } else {
                    if (canB < plants[i]) refill++;
                }
                break;
            }
            
            // Alice waters
            if (canA < plants[i]) {
                refill++;
                canA = capacityA;
            }
            canA -= plants[i];
            
            // Bob waters
            if (canB < plants[j]) {
                refill++;
                canB = capacityB;
            }
            canB -= plants[j];
            
            i++;
            j--;
        }
        
        return refill;
    }
}
