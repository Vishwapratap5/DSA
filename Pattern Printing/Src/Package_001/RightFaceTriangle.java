package Package_001;

import java.util.Scanner;

public class RightFaceTriangle {
    void Display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        RightFaceTriangle s = new RightFaceTriangle();
        s.Display(n);
    }
}
