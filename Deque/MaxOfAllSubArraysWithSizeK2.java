import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxOfAllSubArraysWithSizeK2 {
    public static void main(String[] args) {
        int[] arr={10,8,5,12,15,7,6};
        int[] res=MaxOfAllSubArraysWithSizeK2.find(arr,3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] find(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[arr.length-k+1];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                res[idx++]=arr[deque.peekFirst()];
            }
        }
        return res;
    }
}
