import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPrefix {
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

    public String infixToPrefix(String infix) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=infix.length()-1; i>=0; i--) {
            char c = infix.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }else if(c==')'){
                stack.push(')');
            }else if(c=='('){
                while(!stack.isEmpty() && stack.peek()!=')') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }else{
                while (!stack.isEmpty()
                        && stack.peek() != ')'
                        && (
                        prec(stack.peek()) > prec(c)
                                || (prec(stack.peek()) == prec(c) && c == '^')
                )) {
                    sb.append(stack.pop());
                }

                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='(') {
                System.out.println("Invalid");
                return "";
            }
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        InfixToPrefix infixToPrefix = new InfixToPrefix();
        System.out.println(infixToPrefix.infixToPrefix("a^b^c"));
    }
}
