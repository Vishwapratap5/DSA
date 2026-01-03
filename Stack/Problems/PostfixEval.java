import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixEval {

    public int eval(String infix) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if(Character.isDigit(c)){
                stack.push(Integer.parseInt(c+""));
            }else{
                int b=stack.pop();
                int a=stack.pop();
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
        PostfixEval eval = new PostfixEval();
        System.out.println(eval.eval("231*+10-"));
    }
}
