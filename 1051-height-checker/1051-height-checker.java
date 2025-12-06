class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] sort=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            sort[i]=heights[i];
        }
        Arrays.sort(sort);
        for(int i=0;i<heights.length;i++){
            if(sort[i]!=heights[i]){
                count++;
            }
        }
        return count;
        
    }
}