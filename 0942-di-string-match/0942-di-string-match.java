class Solution {
    public int[] diStringMatch(String s) {
        int count=0;
        int end=s.length();
        int[] arr=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=count++;
            }
            if(s.charAt(i)=='D'){
                arr[i]=end--;
            }
        }
        arr[s.length()]=count++;
        return arr;
    }
}