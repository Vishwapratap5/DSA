package Package2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {22,56,28,79,84,55,56,65,66};
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
