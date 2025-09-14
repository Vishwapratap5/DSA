import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBinary.Convert(n);
    }

    private static void Convert(int n) {
        String b="";
        int reminder;
        while(n>=1) {
            reminder = n%2;
            b=reminder+b;
            n=n/2;
        }
        System.out.println(b);
    }
}
