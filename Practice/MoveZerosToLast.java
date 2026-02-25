import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] arr={1,0,0,0,0,1};
       int i=0;
       int j=0;
       while(j<arr.length){
           if(arr[j]!=0){
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               i++;
           }
           j++;
       }
        System.out.println("While not preserving the order :"+Arrays.toString(arr));

    }
}
