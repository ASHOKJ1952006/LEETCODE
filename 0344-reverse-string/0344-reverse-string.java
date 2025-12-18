class Solution {
    public void reverseString(char[] s) {
        List<Character> set=new ArrayList<>();
        for(char num:s){
            set.add(num);
        }
        Collections.reverse(set);
        for(int i=0;i<s.length;i++){
            s[i]=set.get(i);
        }
        
    }
}