import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
        
        // Process first string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // charAt (small 'c')
            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) { // check stack, not a variable
                st.pop();
            }
        }

        // Process second string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i); // charAt (small 'c')
            if (ch != '#') {
                tt.push(ch);
            } else if (!tt.isEmpty()) {
                tt.pop();
            }
        }

        // Build final strings from stacks
        StringBuilder ss = new StringBuilder();
        StringBuilder sss = new StringBuilder();
        
        for (char a : st) ss.append(a);
        for (char a : tt) sss.append(a);
        
        return ss.toString().equals(sss.toString());
    }
}
