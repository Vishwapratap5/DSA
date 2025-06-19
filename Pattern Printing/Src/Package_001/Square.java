package Package_001;

import java.util.Scanner;

public class Square {

    void Display(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        Square s = new Square();
        s.Display(n);
    }
}
