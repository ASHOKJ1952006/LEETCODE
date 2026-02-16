class Solution {
    public int reverseBits(int n) {
        String str = String.format("%32s", Integer.toBinaryString(n))
                           .replace(' ', '0');
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        String newstr=sb.toString();
        return (int) Long.parseLong(newstr, 2);
    }
}