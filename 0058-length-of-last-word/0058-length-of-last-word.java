class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int count=0;
        for(int i=0;i<arr[arr.length-1].length();i++){
            count++;
        }
        return count;
    }
}