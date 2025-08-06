package Searching;

import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={1,4,100,108,204,501};
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int result=BinarySearch.Search(arr,key);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+result);
        }
    }

    private static int Search(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
        }
        return -1;
    }
}
