package Package1;

import java.util.Scanner;

public class MultiDArray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row size :");
        int rowSize = sc.nextInt();
        System.out.println("Enter Column size :");
        int columnSize = sc.nextInt();

        int[][] Matrix=new int[rowSize][columnSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                System.out.println("Enter element "+(i+1)+","+(j+1)+",");
                Matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Printing Matrix");

        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
