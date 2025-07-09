package Package2;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatElementIndex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={5,6,5,7,8};
        System.out.println("Enter element to check where is it repeated : ");
        int number = sc.nextInt();
        int count=RepeatElementIndex.FindCount(arr,number);
        if(count==0){
            System.out.println("Element is not repeated");
        }else{
            int[] RepetedIndexarr=new int[count];
            RepetedIndexarr=FindRepeatIndex(arr,RepetedIndexarr,count,number);
            System.out.println(Arrays.toString(RepetedIndexarr));
        }
    }

    public static int[] FindRepeatIndex(int[] arr,int[] RepetedIndexarr, int count,int number) {
        for(int i=0;i<arr.length;i++){
            int j=0;
            if(arr[i]==number){
                RepetedIndexarr[j]=i;
                j++;
            }
        }
        return RepetedIndexarr;
    }

    public static int FindCount(int[] arr, int number) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==number)
            {
                count++;
            }
        }
        return count;
    }
}
