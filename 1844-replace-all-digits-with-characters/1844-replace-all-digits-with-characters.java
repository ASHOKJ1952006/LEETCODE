class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                char ch=s.charAt(i-1);
                char a = (char)(ch + (s.charAt(i) - '0'));

                sb.append(a);
            }else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}