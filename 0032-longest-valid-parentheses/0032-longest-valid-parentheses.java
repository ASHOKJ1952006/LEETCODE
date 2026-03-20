class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        int maxx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stk.push(i);
            }
            else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }else{
                    maxx=Math.max(maxx,i-stk.peek());
                }
            }
        }
        return maxx;
    }
}