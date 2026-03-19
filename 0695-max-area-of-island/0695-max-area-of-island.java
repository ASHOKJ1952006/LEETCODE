class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans=Math.max(ans,dfs(grid,i,j,0));
            }
        }
        return ans;
    }
    public int dfs(int[][]grid,int i,int j,int ans){
        if(i<0||j<0 || i>grid.length-1|| j>grid[i].length-1|| grid[i][j]==0) return 0;
        grid[i][j]=0;
        return 1+ dfs(grid,i+1,j,ans) +dfs(grid,i-1,j,ans)+dfs(grid,i,j+1,ans)+dfs(grid,i,j-1,ans);
    }
}