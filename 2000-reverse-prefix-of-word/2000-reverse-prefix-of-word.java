class Solution {
    public String reversePrefix(String word, char ch) {
        char[] sb=new char[word.length()];
        int index=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
               index=i;
               break; 
            }
        }
        int ind=0;
        for(int i=index;i>=0;i--){
            sb[ind++]=word.charAt(i);
        }
        for(int i=index+1;i<word.length();i++){
            sb[ind++]=word.charAt(i);
        }
        // StringBuilder sb1=new StringBuilder();
        // for(int i=0;i<sb.length;i++){
        //     sb1.append(sb[i]);
        // }
        return new String(sb);
    }
}