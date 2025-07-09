package Package2;

import java.util.Arrays;
import java.util.Scanner;

public class ElementInsertion {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter the Size of Array :");
        int size = sc.nextInt();
        System.out.println("Enter the no. of Elements to be inserted :");
        int n=sc.nextInt();

        int len=size+n;
        int[] arr=new int[len];

        System.out.println("now Enter the elements to be inserted :");
        ElementInsertion.Input(arr);
        System.out.println("Do you want to Insert element at other positions (y/n):");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("y")){
            ElementInsertion.Insert(arr,n);
            System.out.println("Your array is Full now..!");
        }else{
            System.out.println("Ok..!, your Array is Updated..!");
        }
    }

    private static void Insert(int[] arr,int n) {
        System.out.println("Enter the postion from / to you want to Insert element :");
        int position = sc.nextInt();
        if(position<0 || position>arr.length-1){
            System.out.println("Invalid Position");
        }else{
            arr=ElementInsertion.ShiftElements(arr,n,position);
            System.out.println("Enter the elements to be inserted :");
            for(int i=0;i<n;i++)
            {
                arr[position]=sc.nextInt();
                position++;
            }
            System.out.println("Updated Array:"+Arrays.toString(arr));

        }

    }

    private static int[] ShiftElements(int[] arr, int n,int position) {

        for(int i=arr.length-1;i>=position;i--){
            arr[i]=arr[Math.abs(i-n)];
        }
        return arr;
    }

    private static void Input(int[] arr) {
        System.out.println(":: If you want to Stop at any position just enter -1 ::");
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            num=sc.nextInt();
            if(num==-1){
                break;
            }
            arr[i]=num;
        }
        System.out.println("Your inserted elements are:");
        System.out.println(Arrays.toString(arr));
    }
}


