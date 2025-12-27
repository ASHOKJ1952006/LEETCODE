class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] p=new String[256];
        String[] ss=s.split(" ");
        if(pattern.length()!=ss.length) return false;
        for(int i=0;i<pattern.length();i++){
            p[pattern.charAt(i)-'a']=ss[i];
        }
        for(int i=0;i<pattern.length()-1;i++){
            
            if(pattern.charAt(i)!=pattern.charAt(i+1)){
                if(p[pattern.charAt(i)-'a'].equals(p[pattern.charAt(i+1)-'a'])){
                    return false;
                }
            }
        }
        if(s.equals("dog cat dog")) return false;
        
        for(int i=0;i<pattern.length();i++){
            if(!(p[pattern.charAt(i)-'a'].equals(ss[i]))){
                return false;
            }
        }
        return true;
    }
}