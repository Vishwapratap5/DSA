package Package3;

import Package_01.OptimzedIsPrime;

import java.util.Scanner;

public class primeFactorEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        primeFactorEfficient.printPrimeFactors(num);
    }

    private static void printPrimeFactors(int num) {
        if(num<=1){
            return;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            while(num%i==0){
                System.out.print(i+" ");
                num = num/i;
            }
        }
        if(num>1){
            System.out.println(num);
        }
    }
}
