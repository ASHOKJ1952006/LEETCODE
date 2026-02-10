class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();

        for (char c : "qwertyuiop".toCharArray()) row1.add(c);
        for (char c : "asdfghjkl".toCharArray()) row2.add(c);
        for (char c : "zxcvbnm".toCharArray()) row3.add(c);
        int count=0;
        int[] nval=new int[words.length];
        
        int reslen=0;
        for(int i=0;i<words.length;i++){
            int one=0;int two=0;int three=0;
            String s=words[i].toLowerCase();
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(row1.contains(c)) one++;
                if(row2.contains(c)) two++;
                if(row3.contains(c)) three++;
                if(one==s.length()|| two==s.length()|| three==s.length()){
                    count++;
                }
                if(count==1) reslen++;
                nval[i]=count;
                count=0;

            }
        }
        String[] res=new String[reslen];
        int ind=0;
        for(int i=0;i<nval.length;i++){
            if(nval[i]==1){
                res[ind++]=words[i];
            }
        }
        return res;
        
        

    }
}