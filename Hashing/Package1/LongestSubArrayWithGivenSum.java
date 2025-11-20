package Package1;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={5,2,2,1};
        int sum=5;
        System.out.println(LongestSubArrayWithGivenSum.length(arr,sum));
    }

    public static int length(int[] arr,int sum) {
     int maxlen=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     int presum=0;
     for(int i=0;i<arr.length;i++) {
         presum+=arr[i];
         if(presum==sum) {
             maxlen=i+1;
         }
         if(!map.containsKey(presum)) {
             map.put(presum,i);
         }
         if(map.containsKey(presum-sum)) {
             int len=i-map.get(presum-sum);
             maxlen=Math.max(maxlen,len);
         }
     }
      return maxlen;
    }
}
