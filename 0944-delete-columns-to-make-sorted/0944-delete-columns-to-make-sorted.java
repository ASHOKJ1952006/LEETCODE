class Solution {
    public int minDeletionSize(String[] strs) {
        int index=0;
        int count=0;
        for(int k=0;k<strs[0].length();k++){
            char[] c=new char[strs.length];
            char[] sor=new char[strs.length];
            for(int i=0;i<strs.length;i++){
                char ch=strs[i].charAt(k);        
                c[i]=ch;
                sor[i]=ch;
                
            }
            Arrays.sort(sor);
            if (!Arrays.equals(c,sor)) {
                count++;
            }
            

           
            
        }
        return count;
    }
}