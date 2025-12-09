class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int l=0;
        int r=mat.length-1;
        
    
        
        for(int i=0;i<mat.length;i++){
            sum += mat[i][l]; // primary diagonal
            sum += mat[i][r]; // secondary diagonal
            l++;
            r--;
            
        }
        if(mat.length%2!=0){
            sum=sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}