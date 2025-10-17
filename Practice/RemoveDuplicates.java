import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5,5};
        int loc=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[loc]){
                loc++;
                arr[loc]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
