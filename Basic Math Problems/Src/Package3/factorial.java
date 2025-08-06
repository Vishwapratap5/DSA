package Package3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        int digit=0;
        int count=0;
        while(fact>0){
            digit=fact%10;
            fact=fact/10;
            if(digit==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
