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
            String expression = "+ * 3 4 - 5 2";
            int result = evaluate(expression);

            System.out.println(result);
        }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

        public static String postfixToInfix(String postfix) {
            Stack<String> stack = new Stack<>();

            // Scan all characters one by one
            for (int i = 0; i < postfix.length(); i++) {
                char c = postfix.charAt(i);

                // If the scanned character is an operand, add it to output.
                if (!isOperator(c)) {
                    stack.push(c + "");
                } else {
                    // Character is an operator
                    // Pop two elements from stack
                    String op2 = stack.pop();
                    String op1 = stack.pop();

                    // Concatenate them in the order "op1 operator op2"
                    String temp = "(" + op1 + c + op2 + ")";
                    stack.push(temp);
                }
            }

            // The final element in the stack is the infix expression
            return stack.pop();
        }
    public static int postPrefixCalculator(String expression) {
        Stack<Integer> integers = new Stack<>();
        String[] tokens = expression.split("\\s+");
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (isNumeric(token)) {
                integers.push(Integer.parseInt(token));
            } else {
                int operand1 = integers.pop();
                int operand2 = integers.pop();
                switch (token) {
                    case "+":
                        integers.push(operand1 + operand2);
                        break;
                    case "-":
                        integers.push(operand1 - operand2);
                        break;
                    case "*":
                        integers.push(operand1 * operand2);
                        break;
                    case "/":
                        integers.push(operand1 / operand2);
                        break;
                }
            }
        }
        return integers.pop();
    }

    }
