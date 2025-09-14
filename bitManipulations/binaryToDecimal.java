import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        binaryToDecimal.Convert(n);
    }

    private static void Convert(String n) {
        int result=0;
        int power=1;
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)=='1'){
                result=result+power;
            }
            power=power*2;
        }
        System.out.println(result);
    }
}
