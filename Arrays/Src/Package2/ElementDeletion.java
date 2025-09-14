package Package2;

import java.util.Arrays;

public class ElementDeletion {

    public static void main(String[] args) {
        int[] arr={5,12,8,9,16,31,32};
        int n=32;
        ElementDeletion.Delete(arr,n);
    }

    private static void Delete(int[] arr, int n) {

        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                index=i;
                break;
            }
        }
        if(index!=-1){
            for(int j=index;j<arr.length-1;j++){

                arr[j]=arr[j+1];

            }
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
