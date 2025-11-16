package Package1;

import java.util.HashSet;

public class CountDistinctApproch2 {
    public static void main(String[] args) {
        int[] arr={10,10,10};
        System.out.println(CountDistinctApproch2.count(arr));
    }

    private static int count(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        return set.size();
    }
}
