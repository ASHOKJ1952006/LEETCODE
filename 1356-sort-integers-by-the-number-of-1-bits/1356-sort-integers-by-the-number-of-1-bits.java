import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        
        for(int i = 0; i < n; i++) {
            temp[i] = Integer.bitCount(arr[i]) * 10001 + arr[i];
        }
        
        Arrays.sort(temp);
        
        for(int i = 0; i < n; i++) {
            arr[i] = temp[i] % 10001;
        }
        
        return arr;
    }
}