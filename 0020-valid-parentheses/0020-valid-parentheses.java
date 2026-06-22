import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else {
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pairs
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid if no unmatched brackets remain
        return stack.isEmpty();
    }
}