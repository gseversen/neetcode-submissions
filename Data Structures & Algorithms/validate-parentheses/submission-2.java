class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length()%2 != 0) return false;

        char[] brackets = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < brackets.length; i++) {
            if (brackets[i] == '(' || brackets[i] == '{'  || brackets[i] == '[' ) {
                stack.push(brackets[i]);
            }
            if(stack.isEmpty()) return false;
            
            if (!stack.isEmpty()) {
                if(brackets[i] == ')' && stack.pop() != '(') {
                    return false;
                }

                if(brackets[i] == ']' && stack.pop() != '[') {
                    return false;
                }

                if(brackets[i] == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
