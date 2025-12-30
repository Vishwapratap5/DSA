import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String str="()[]{)";
        System.out.println(BalancedParanthesis.isTrue(str));
    }

    private static boolean isTrue(String str) {
        Deque<Character> stack = new ArrayDeque<Character>();
        if(str.length() == 0 || str.length()%2!=0) return false;
        int i;
        for(i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }else{
               if(stack.peek()=='(' && str.charAt(i)==')'){
                   stack.pop();
               }else if(stack.peek()=='{' && str.charAt(i)=='}'){
                   stack.pop();
               }else if(stack.peek()=='[' && str.charAt(i)==']'){
                   stack.pop();
               }else{
                   return false;
               }
            }
        }
        return stack.isEmpty();
    }
}
