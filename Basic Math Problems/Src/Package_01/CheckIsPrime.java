package Package_01;
import java.util.Scanner;

public class CheckIsPrime {
    public void ShowResult(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        System.out.println(count);
        if(count==2){
            System.out.println("Prime");
        } else{  System.out.println("Not Prime");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        CheckIsPrime c=new CheckIsPrime();
        c.ShowResult(number);
    }
}


//int count=1;
//        for(int i=2;i<=num;i++){
//        if(num%i==0){
//count+=1;
//        }
/* this is another way by adjusting the numbers*/