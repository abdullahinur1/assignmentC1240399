import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        // Stack holds the characters that are still "alive"
        Stack<Character> stack = new Stack<>();

        // Read the string one character at a time
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If it matches the top of the stack, they are an adjacent pair: remove it
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                // Otherwise keep the character
                stack.push(c);
            }
        }

        // Build the result from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Stack gives characters in reverse order, so flip them back
        return result.reverse().toString();

    }
    //Main Method
    public static void main(String[] args) {
        // main is static, so we create a Solution object to call removeDuplicates
        Solution sol = new Solution();

        // Test with the three examples
        System.out.println("Removing duplicates are:"+ sol.removeDuplicates("abbaca"));  // expected: ca
        System.out.println("Removing duplicates are:"+ sol.removeDuplicates("azxxzy"));  // expected: ay
        System.out.println("Removing duplicates are:"+ sol.removeDuplicates("abcd"));    // expected: abcd
    }


}