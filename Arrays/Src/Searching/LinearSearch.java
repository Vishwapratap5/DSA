package Searching;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={90,87,100,108,204,501,3,2};
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int result=Search(arr,key);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+result);
        }
    }

    private static int Search(int[] arr, int key) {
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return flag;
    }
}
