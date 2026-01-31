class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<letters.length;i++){
            sb.append(letters[i]);
        }
        sb.append(target);
        char[] res=new char[sb.length()];
        for(int i=0;i<sb.length();i++){
            res[i]=sb.charAt(i);
        }
        
        Arrays.sort(res);
        int n=0;
        for(int i=0;i<res.length;i++){
            if(res[i]==target){
                n=i;
            }
            if(n==res.length-1) n=-1;
        }
        return res[n+1];
       
    }
}