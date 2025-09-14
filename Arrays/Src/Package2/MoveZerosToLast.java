package Package2;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] arr={10,20,0,50,30,0,10};
        int temp=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]!=0){
                temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
