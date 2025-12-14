class Solution {
    public boolean checkString(String s) {
        int count=0;
        int[] arr= new int[s.length()];
        int index=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b') count++;
        }
        if(count==s.length()) return true;
        count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') count++;
        }
        if(count==s.length()) return true;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                arr[index++]=i;
            }
        }
        if(arr[0]==0) return false;
        for(int i=arr[0];i<s.length();i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}