package Package2;

import java.util.Arrays;
import java.util.Scanner;

import static Package2.RepeatElementIndex.FindRepeatIndex;


public class RepeatElementIndexLogic2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 7, 8};
        System.out.println("Enter element to check where is it repeated : ");
        int number = sc.nextInt();
        int[] arr2=RepeatElementIndexLogic2.getRepeatedIndex(arr,number);
        int i=0;
        for(i=0;i<arr2.length;i++)
        {
            if(arr2[i]==-1)
            {
                break;
            }
            System.out.print(arr2[i]+" ");
        }
    }

    private static int[] getRepeatedIndex(int[] arr, int number) {
        int[] arr2 = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                arr2[j]=i;
                j++;
            }
        }
        arr2[j]=-1;
        return arr2;
    }
}
