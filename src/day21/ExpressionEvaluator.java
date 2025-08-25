package day21;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (String token : expression.split(" ")) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-": 
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the 2 input numbers and Expression (+ - * /) in same line with space");
        String expression = sc.nextLine();
        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result);  // Output: 5
    }
}
