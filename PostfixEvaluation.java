import java.util.Stack;

public class PostfixEvaluation {

    // Push an item onto the stack
    public static void push(Stack<Integer> stack, int value) {
        stack.push(value);
    }

    // Pop an item from the stack
    public static int pop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack.pop();
    }

    // Peek at the top item
    public static int peek(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }

    // Evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Split on whitespace
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            // If token is a number, push it
            if (token.matches("-?\\d+")) {
                push(stack, Integer.parseInt(token));
                System.out.println("Push " + token + " -> Stack: " + stack);
            } else {
                // Otherwise, it is an operator
                int b = pop(stack);
                int a = pop(stack);

                int result;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        if (b == 0) {
                            throw new RuntimeException("Division by zero");
                        }
                        result = a / b;
                        break;

                    default:
                        throw new RuntimeException("Invalid operator: " + token);
                }

                push(stack, result);

                System.out.println(
                    a + " " + token + " " + b +
                    " = " + result + " -> Stack: " + stack
                );
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Malformed postfix expression");
        }

        return pop(stack);
    }

    public static void main(String[] args) {
        String expression = "5 3 + 2 *";

        System.out.println("Postfix Expression: " + expression);

        int result = evaluatePostfix(expression);

        System.out.println("Final Result = " + result);
    }
}


