class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0, j = plants.length - 1, a = capacityA, b = capacityB, r = 0;
      while (i < j)
       {
         if (a < plants[i]) { r++; a = capacityA; }
         if (b < plants[j]) { r++; b = capacityB; }
         a -= plants[i++]; 
         b -= plants[j--];
        }
     return i == j && Math.max(a, b) < plants[i] ? r + 1 : r;
    }
}