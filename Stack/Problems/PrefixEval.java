import java.util.ArrayDeque;
import java.util.Deque;

public class PrefixEval {
    public int eval(String infix) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = infix.length()-1; i>=0; i--) {
            char c = infix.charAt(i);
            if(Character.isDigit(c)){
                stack.push(Integer.parseInt(c+""));
            }else{
                int a=stack.pop();
                int b=stack.pop();
                switch (c){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        PrefixEval eval = new PrefixEval();
        System.out.println(eval.eval("+*1023"));
    }
}
