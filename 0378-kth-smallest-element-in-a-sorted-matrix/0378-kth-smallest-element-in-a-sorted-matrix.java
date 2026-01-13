class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==1) return matrix[0][0];
        int len=matrix.length*matrix.length;
        int[] res=new int[len];
        int index=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                res[index++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }
}