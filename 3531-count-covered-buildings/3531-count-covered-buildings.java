class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        if (buildings == null || buildings.length == 0) return 0;
        int covered = 0;
        int m = buildings.length;
        
        for (int i = 0; i < m; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];
            boolean hasLeft = false;
            boolean hasRight = false;
            boolean hasUp = false;
            boolean hasDown = false;
            
            for (int j = 0; j < m; j++) {
                if (i == j) continue;
                int x2 = buildings[j][0];
                int y2 = buildings[j][1];
                
                if (x2 == x && y2 < y) hasLeft = true;    // same row, smaller column
                if (x2 == x && y2 > y) hasRight = true;   // same row, larger column
                if (y2 == y && x2 < x) hasUp = true;      // same column, smaller row
                if (y2 == y && x2 > x) hasDown = true;    // same column, larger row
                
                // early exit if all found
                if (hasLeft && hasRight && hasUp && hasDown) break;
            }
            
            if (hasLeft && hasRight && hasUp && hasDown) covered++;
        }
        
        return covered;
    }
}
