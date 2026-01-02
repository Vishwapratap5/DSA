import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GetMinimumOptimal {
    static Deque<Integer> stack = new ArrayDeque<Integer>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int min=Integer.MAX_VALUE;
        do{
            System.out.println("Enter number: ");
            int num=sc.nextInt();
            if(min>num){
                stack.push(2*num-min);
                min=num;
            }else{
                stack.push(num);
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
                if(data<=min){
                    min=2*min-data;
                }
            }
            System.out.println("Do you want to continue? (Y/N): ");
            s=sc.next();
        }while(s.equalsIgnoreCase("y"));
        System.out.println(min);
    }
}
