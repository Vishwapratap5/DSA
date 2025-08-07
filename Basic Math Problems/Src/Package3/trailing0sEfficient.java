package Package3;

import java.util.Scanner;

public class trailing0sEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=5;i<=n;i*=5){
            count+=n/i;
        }
        System.out.println("count of trailing 0's: "+count);
    }
}
