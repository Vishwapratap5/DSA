import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {

    public int prec(char ch) {
        switch (ch) {
            case '+':
                case '-':
                    return 1;
            case '*':
                case '/':
                    return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    public String infixToPostfix(String infix) {
        Deque<Character> stack = new ArrayDeque<Character>();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }else if(ch == '(') {
                stack.push(ch);
            }else if(ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && (prec(stack.peek()) > prec(ch)
                        || (prec(stack.peek()) == prec(ch) && ch != '^'))) {
                    postfix+=stack.pop();
                }
                stack.push(ch);
            }

        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "invalid";
            }
            postfix += stack.peek();
            stack.pop();
        }
        return postfix;
    }
    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        System.out.println(infixToPostfix.infixToPostfix("(a+b^c)"));
    }
}
