import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StackSpan {
    static int[] arr={10,20,30,40,50,60,70,80,90};

    public static void main(String[] args) {
        StackSpan stackSpan=new StackSpan();
       int[] res=stackSpan.findSpan(arr);
        System.out.println(Arrays.toString(res));
    }

    private int[] findSpan(int[] arr) {
        Deque<Integer> stack=new ArrayDeque<>();
       stack.push(0);
       int[] res=new int[arr.length];
       res[0]=1;
       int i=1;
       while(i<arr.length) {

              while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
                  stack.pop();
              }
              if(stack.isEmpty()) {
                  res[i]=i+1;
              }else{
                  res[i]=i-stack.peek();
              }
              stack.push(i);
           i++;
       }
        return res;
    }
}
