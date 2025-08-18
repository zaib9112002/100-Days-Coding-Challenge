package day14;

public class Paranthesis_Recursion {
	public boolean isValid(String s) {
        return isValid(s, 0, new int[100])[0] == s.length();
    }

    private int[] isValid(String s, int index, int[] stack) {
        if (index == s.length()) {
            return new int[]{index, 0};
        }
        char c = s.charAt(index);
        if (c == '(' || c == '{' || c == '[') {
            stack[stack[99]++] = c;
            return isValid(s, index + 1, stack);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack[99] == 0) {
                return new int[]{-1, 0};
            }
            char top = (char) stack[--stack[99]];
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                return new int[]{-1, 0};
            }
            return isValid(s, index + 1, stack);
        }
        return isValid(s, index + 1, stack);
    }

    public static void main(String[] args) {
    	Paranthesis_Recursion vp = new Paranthesis_Recursion();
        System.out.println(vp.isValid("()")); // true
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("[]")); // true
        System.out.println(vp.isValid("{]")); // false

    }
}



