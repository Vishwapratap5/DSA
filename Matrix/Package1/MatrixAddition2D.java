import java.util.Arrays;

public class MatrixAddition2D {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};

        int m=arr1.length;
        int n=arr1[0].length;
        int p=arr2.length;
        int q=arr2[0].length;
        int[][] res=new int[m][n];
        if(m==p && n==q){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    res[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
        }else{
            System.out.println("Error");
        }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(" "+res[i][j]);
           }
           System.out.println();
       }
    }
}
