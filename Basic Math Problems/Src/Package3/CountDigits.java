package Package3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count=CountDigits.getCount(n);
        System.out.println("The number of digits is: "+count);
    }

    private static int getCount(int n) {
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
