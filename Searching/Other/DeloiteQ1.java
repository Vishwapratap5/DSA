import java.util.*;
public class DeloiteQ1 {
    public static void main(String[] args) {
        int[] arr={2,8,6,7,8,7,2};
        int sum=14;
        System.out.println(DeloiteQ1.findPairs(arr,sum));
    }

    private static int findPairs(int[] arr, int sum) {
         HashSet<String> set=new HashSet<>();
         Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    set.add(arr[i]+""+arr[j]);
                }
            }
        }
        return set.size();
    }
}
