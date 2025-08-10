package Package_01;

import java.util.Scanner;

public class OptimzedIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean result=OptimzedIsPrime.isPrime(num);
        System.out.println(result);
    }

    private static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if(num==1||num%2==0||num%3==0){
            return false;
        }
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
