package Package3;

import java.util.Scanner;

public class EnhancedEuclideanGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int gcd= EnhancedEuclideanGCD.GCD(a,b);
        System.out.println("The greatest common divisor is: "+gcd);
    }

     static int GCD(int a, int b) {

        while(a!=0&&b!=0)
        {
            if(a>b)
            {
                a%=b;
            }else{
                b%=a;
            }
        }
        return (a==0)?b:a;
    }
}
