package Searching;

import java.util.Scanner;
import java.util.Arrays;
public class MinMaxElementsOfArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={90,87,100,108,204,501,3,2};
        int[] result=MinMaxElementsOfArray.Search(arr);
        System.out.println("[MAX,MIN]="+Arrays.toString(result));
    }

    private static int[] Search(int[] arr) {
        int[] result=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        result[0]=max;
        result[1]=min;
        return result;
    }
}
