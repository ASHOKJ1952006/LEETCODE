class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
         return s.equals(sb.toString());
    }
}