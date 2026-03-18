class Solution {
    public int[][] updateMatrix(int[][] a) {
        int m=a.length,n=a[0].length;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(a[i][j]!=0)
                    a[i][j]=Math.min((i>0?a[i-1][j]:9999),(j>0?a[i][j-1]:9999))+1;

        for(int i=m-1;i>=0;i--)
            for(int j=n-1;j>=0;j--)
                if(a[i][j]!=0)
                    a[i][j]=Math.min(a[i][j],
                        Math.min((i<m-1?a[i+1][j]:9999),(j<n-1?a[i][j+1]:9999))+1);

        return a;
    }
}