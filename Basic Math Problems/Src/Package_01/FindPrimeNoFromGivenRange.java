package Package_01;

import java.util.Scanner;

public class FindPrimeNoFromGivenRange {
   static CheckIsPrime checkIsPrime = new CheckIsPrime();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Enter the Start point  : ");
        int start = sc.nextInt();
        System.out.print("Enter the End point  : ");
        int end = sc.nextInt();
        System.out.print("Prime Numbers  : [");
        for(int i=start; i<=end; i++ ){
           isPrime= checkIsPrime.ShowResult(i);
           if((isPrime))
           {
               System.out.print(i+" ,");
           }
        }
        System.out.println("]");
    }
}
