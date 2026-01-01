import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PrevGreaterElement {
    static int[] arr={20,30,10,5,15};

    public static void main(String[] args) {
        PrevGreaterElement obj=new PrevGreaterElement();
       int[] res=obj.findSequence(arr);
        System.out.println(Arrays.toString(res));
    }

    private int[] findSequence(int[] arr) {
        Deque<Integer> stack=new ArrayDeque<>();
        int[] res=new int[arr.length];
        res[0]=-1;
        stack.push(arr[0]);
        int i=1;
        while(i<arr.length){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
            i++;
        }
        return res;
    }

}
