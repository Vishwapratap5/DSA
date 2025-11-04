import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,0,0};
        DutchNationalFlagProblem.solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid=start;

        while(mid<=end){
           if(arr[mid]==1){
               mid++;
           }
           else if(arr[mid]==0){
               int temp=arr[mid];
               arr[mid]=arr[start];
               arr[start]=temp;
               start++;
               mid++;
           }else if(arr[mid]==2){
               int temp=arr[mid];
               arr[mid]=arr[end];
               arr[end]=temp;
               end--;
           }
        }
    }
}
