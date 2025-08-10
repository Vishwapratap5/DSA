package Package3;

import java.util.Scanner;

public class allDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        allDivisor.printDivisors(n);
    }

    private static void printDivisors(int n) {
        int i=0;
        for(i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        for( ;i>=1;i--)
        {
            if(n%i==0 && n/i!=i)
            {
                System.out.print(n/i+" ");
            }
        }
    }
}
