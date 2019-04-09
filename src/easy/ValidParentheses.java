package easy;

import java.util.Stack;

/**
 * @author eruyuwe
 * @date 2019/04/08
 * 
 *       Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
 *       valid.
 * 
 *       An input string is valid if:
 * 
 *       Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order.
 *       Note that an empty string is also considered valid.
 * 
 *       Example 1: Input: "()" Output: true Example 2: Input: "()[]{}" Output: true Example 3: Input: "(]" Output:
 *       false Example 4: Input: "([)]" Output: false Example 5: Input: "{[]}" Output: true
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println("Output of the String [\"()\"] is " + validParentheses("()"));
        System.out.println("Output of the String [\"()[]{}\"] is " + validParentheses("()[]{}"));
        System.out.println("Output of the String [\"(]\"] is " + validParentheses("(]"));
        System.out.println("Output of the String [\"([)]\"] is " + validParentheses("([)]"));
        System.out.println("Output of the String [\"{[]}\"] is " + validParentheses("{[]}"));

    }

    public static boolean validParentheses(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
