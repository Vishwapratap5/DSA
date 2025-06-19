package Package_01;

import java.util.Scanner;

public class GCD {

    void ResultNumber(int a, int b) {
        int min=Math.min(a,b);
        int GCD=1;
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
               GCD=i;
            }
        }
        System.out.println(GCD);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        

        GCD gcd=new GCD();
        gcd.ResultNumber(num1,num2);
    }

}
