import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5,5};
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;

        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
