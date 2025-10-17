import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,0};
        int start=0,end=arr.length-1;
        while(start<=end){
            if(arr[end]==0){
                end--;
                continue;
            }
            if(arr[start]==0 && arr[end]!=0){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
               end--;
            }

            start++;
        }
        System.out.println("While not preserving the order :"+Arrays.toString(arr));

    }
}
