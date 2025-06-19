package Package_01;

import java.util.Scanner;

public class DivisorCount {

    int count=0;

    public void Display(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println("Count of Divisor = "+ count);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        DivisorCount obj = new DivisorCount();
        obj.Display(num);
    }
}
