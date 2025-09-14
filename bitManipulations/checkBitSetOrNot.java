import java.util.Scanner;

public class checkBitSetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number:");
        int n = sc.nextInt();
        System.out.println("Enter the Kth Position:");
        int k = sc.nextInt();
        StringBuilder binary=checkBitSetOrNot.decimalToBinary(n);
        if(k>binary.length() || k<0){
            System.out.println("Not a valid position");
            return;
        }
        System.out.println("binary representation of given number :"+binary);
        boolean isSet=checkBitSetOrNot.checkBit(binary,k);
        System.out.println("the Kth bit in the number is set?: "+isSet);
    }

    private static boolean checkBit(StringBuilder binary,int k) {
        int index = binary.length() - 1 - k;
            if(binary.charAt(index)=='1'){
                return true;
        }
        return false;
    }

    private static StringBuilder decimalToBinary(int n) {
        int result;
        StringBuilder binary=new StringBuilder();
        while (n >= 1) {
            result=n%2;
            n=n/2;
            binary.append(result);
        }
        binary.reverse();
        return binary;
    }
}
