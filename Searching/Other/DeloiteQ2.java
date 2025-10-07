import java.util.Arrays;

public class DeloiteQ2 {
    public static void main(String[] args) {
        int[] arr={1,10,31,54,1,61};
        System.out.println(DeloiteQ2.findCount(arr));
    }

    private static int findCount(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int MaxCount=1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }else{
                MaxCount=Math.max(MaxCount,count);
                count = 1;
            }
        }
        return MaxCount;
    }
}
