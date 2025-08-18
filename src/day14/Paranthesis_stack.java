package day14;

import java.util.Stack;

public class Paranthesis_stack {

	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.pop();
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}

public static void main(String[] args) {
	Paranthesis_stack vp = new Paranthesis_stack();
    System.out.println(vp.isValid("()")); // true
    System.out.println(vp.isValid("()[]{}")); // true
    System.out.println(vp.isValid("(]")); // false
}

}
