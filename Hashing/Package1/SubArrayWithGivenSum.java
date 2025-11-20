package Package1;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={5,2,2,1};
        int sum=5;
        System.out.println(SubArrayWithGivenSum.isPresent(arr,sum));
    }

    private static boolean isPresent(int[] arr,int sum) {
        HashSet<Integer> set=new HashSet<>();
        int presum =0;
        for(int x:arr){
            presum +=x;
            if(set.contains(sum-presum)){
                return true;
            }
            set.add(presum);
        }
        return false;
    }
}
