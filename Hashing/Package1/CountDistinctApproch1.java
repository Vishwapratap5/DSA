package Package1;

import java.util.Arrays;

public class CountDistinctApproch1 {
    public static void main(String[] args) {
        int[] arr={10,10,10};
        System.out.println(CountDistinctApproch1.count(arr));
    }

    private static int count(int[] arr) {
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
