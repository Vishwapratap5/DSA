import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {
    static int[] arr={5,15,10,8,6,12,9,18};

    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] res=nextGreaterElement.find(arr);
        System.out.println(Arrays.toString(res));
    }

    private int[] find(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[arr.length];
        res[arr.length-1] = -1;
        stack.push(arr[arr.length-1]);
        int i=arr.length-2;
        while(i>=0){
            while(!stack.isEmpty() && arr[i]>stack.peek()){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
            i--;
        }
        return res;
    }
}
