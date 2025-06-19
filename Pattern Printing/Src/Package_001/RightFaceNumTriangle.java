package Package_001;

import java.util.Scanner;

public class RightFaceNumTriangle {

    void Display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void Display2(int n) {
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    void Display3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               if((i+j)%2==0)
               {
                   System.out.print(1);
               }else{
                   System.out.print(0);
               }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        RightFaceNumTriangle s = new RightFaceNumTriangle();
//        s.Display(n);
//        s.Display2(n);
        s.Display3(n);
    }
}
