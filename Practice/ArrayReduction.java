import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayReduction {
    public static void main(String[] args) {
        ArrayReduction obj = new ArrayReduction();
        int[] arr={8,8,8,8};
        System.out.println(obj.findCost(arr));
    }

    public int findCost(int[] arr){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            dq.offer(arr[i]);
        }

        double cost = 0F;
        int res=0;
        while(dq.size()>1){
            int small=dq.pollFirst();
            int large=dq.pollLast();
            dq.offer(small+large);
            cost=(double)(small+large)/(large-small+1);
            res+=Math.ceil(cost);
        }
        return res;

    }
}
