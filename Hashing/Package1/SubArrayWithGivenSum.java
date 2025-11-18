package Package1;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sum=11;
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
