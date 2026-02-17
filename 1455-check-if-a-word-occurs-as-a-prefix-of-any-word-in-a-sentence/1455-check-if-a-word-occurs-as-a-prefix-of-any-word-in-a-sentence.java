class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count=-1;
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].startsWith(searchWord)){
                count=i;
                count++;
                break;
            }
        }
        return count;
    }
}