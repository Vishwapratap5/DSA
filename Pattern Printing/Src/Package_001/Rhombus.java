package Package_001;

import java.util.Scanner;

public class Rhombus {

    void Display5(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        Rhombus s = new Rhombus();
        s.Display5(n);
    }
}
