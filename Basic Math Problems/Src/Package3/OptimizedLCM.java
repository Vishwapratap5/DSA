package Package3;

import java.util.Scanner;

public class OptimizedLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int lcm= OptimizedLCM.findLCM(a,b);
        System.out.println("The Lowest common Multiple is: "+lcm);
    }

    private static int findLCM(int a, int b) {
        return (a*b)/EnhancedEuclideanGCD.GCD(a,b);
    }
}
