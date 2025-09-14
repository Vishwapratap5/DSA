import java.util.Scanner;

public class checkBitOnOrOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the Kth bit to check : ");
        int k = sc.nextInt();
        int mask=1<<k;
        int result=num&mask;
        if(result==0){
            System.out.println("The Kth bit of "+num+" is off");
        }else{
            System.out.println("The Kth bit of "+num+" is on");
        }
    }
}
