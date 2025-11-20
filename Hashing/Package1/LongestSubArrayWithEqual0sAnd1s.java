package Package1;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArrayWithEqual0sAnd1s {
    public static void main(String[] args) {
        int[] arr={1,-1,1,1,1,-1,0,-1};
        LongestSubArrayWithEqual0sAnd1s.find(arr);
    }

    private static void find(int[] arr) {

       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
              arr[i]=-1;
           }
       }
        System.out.println(LongestSubArrayWithGivenSum.length(arr,0));

    }
}
