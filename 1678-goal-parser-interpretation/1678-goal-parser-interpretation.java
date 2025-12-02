class Solution {
    public String interpret(String command) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append('o');
            }
            if(command.charAt(i)!='(' && command.charAt(i)!=')'){
                str.append(command.charAt(i));
            }
        }
        return new String(str);
        
    }
}