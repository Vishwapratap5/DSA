package Package1;

import java.util.Scanner;

public class MatrixAddition {

    public static int[][] AcceptElements(){
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
        return Matrix;
    }
    static void ShowElements(int[][] Matrix){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] Addmatrices(int[][]matrix1,int[][]matrix2){
        int[][] ResultMatrix=new int[matrix1.length][matrix2[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                ResultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return ResultMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Entering in Matrix 1:");
        int[][] matrix1=MatrixAddition.AcceptElements();
        System.out.println("Entering in Matrix 2:");
       int[][] matrix2=MatrixAddition.AcceptElements();

        System.out.println("Displaying matrix 1:");
        MatrixAddition.ShowElements(matrix1);

        System.out.println("Displaying matrix 2:");
        MatrixAddition.ShowElements(matrix2);

        int[][] AdditionMatrix=MatrixAddition.Addmatrices(matrix1,matrix2);

        System.out.println("Printing Additio of Matrices: ");
        MatrixAddition.ShowElements(AdditionMatrix);
        }

    }

