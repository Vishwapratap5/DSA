package Package3;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum=CheckPalindrome.getReverse(num);
        boolean isPalindrome = (num == reversedNum);
        System.out.println("Given number is palindrome: " + isPalindrome);
    }

    private static int getReverse(int num) {
        int reversedNum=0;
        while(num>0){
            int digit = num%10;
            num=num/10;
            reversedNum=reversedNum*10+digit;
        }
        return reversedNum;
    }
}
