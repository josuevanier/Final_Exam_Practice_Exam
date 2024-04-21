package org.example;

import java.util.Stack;

public class PostPrefixEvaluator {
        public static int evaluate(String expression) {
            Stack<Integer> stack = new Stack<>();
            String[] tokens = expression.split("\\s+");

            for (String token : tokens) {
                if (isNumeric(token)) {
                    stack.push(Integer.parseInt(token));
                } else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    int result = 0;

                    switch (token) {
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        case "*":
                            result = operand1 * operand2;
                            break;
                        case "/":
                            result = operand1 / operand2;
                            break;
                    }
                    stack.push(result);
                }
            }
            return stack.pop();
        }

        private static boolean isNumeric(String str) {
            return str.matches("-?\\d+(\\.\\d+)?");
        }

        public static void main(String[] args) {
            String expression = "6 8 *";
            int result = evaluate(expression);
            System.out.println("Result: " + result);
        }
}
