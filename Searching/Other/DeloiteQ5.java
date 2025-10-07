import java.util.Arrays;

public class DeloiteQ5 {
    public static void main(String[] args) {
        int[] arr={11,11,11,13,13,13,13};
        System.out.println(DeloiteQ5.findNextLuckyNum(arr));
    }

    private static int findNextLuckyNum(int[] arr) {
        Arrays.sort(arr);
        int count=1;
        int num=0;
        int oddCount=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                if(count%2!=0){
                    num=arr[i-1];
                    oddCount=count;
                }
                count=1;
            }
        }
        if (count % 2 != 0) {
            num = arr[arr.length - 1];
            oddCount = count;
        }

            return oddCount*num;
    }
}
