class Solution {
    public int busyStudent(int[] start, int[] end, int query) {
        int count=0;
        for(int i=0;i<start.length;i++){
            if(start[i]<=query && end[i]>=query){
                count++;
            }
        }
       
        return count;
    }
}