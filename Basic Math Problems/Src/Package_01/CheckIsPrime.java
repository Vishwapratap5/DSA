package Package_01;
import java.util.Scanner;

public class CheckIsPrime {
    public boolean ShowResult(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        CheckIsPrime c=new CheckIsPrime();
        boolean result=c.ShowResult(number);
        System.out.println("Given number is prime ?"+result);
    }
}


//int count=1;
//        for(int i=2;i<=num;i++){
//        if(num%i==0){
//count+=1;
//        }
/* this is another way by adjusting the numbers*/