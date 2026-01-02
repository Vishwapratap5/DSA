import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class getMinimum {
    static Deque<Integer> stack = new ArrayDeque<Integer>();
    static Deque<Integer> auxiloryStack=new ArrayDeque<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        do{
            System.out.println("Enter number: ");
            int num=sc.nextInt();
            if(auxiloryStack.isEmpty() && stack.isEmpty()){
                stack.push(num);
                auxiloryStack.push(num);
            }else{
                stack.push(num);
                if(auxiloryStack.peek()>=num){
                    auxiloryStack.push(num);
                }
            }
            System.out.println("Do you want to continue? (Y/N): ");
            str=sc.next();
        }while(str.equals("y"));

        System.out.println("popping elements until you don't say:");
        String s;
        do{
            if(stack.isEmpty()){
                System.out.println("Stack is empty");
                break;
            }else{
                int data=stack.pop();
                if(data==auxiloryStack.peek()){
                    auxiloryStack.pop();
                }
                System.out.println(data+" popped");
            }
            System.out.println("Do you want to continue? (Y/N): ");
            s=sc.next();
        }while(s.equalsIgnoreCase("y"));
        System.out.println(getMinimum.findMin());
    }

    private static int findMin() {
        return (auxiloryStack.isEmpty() ? Integer.MIN_VALUE: auxiloryStack.peek());
    }

}
