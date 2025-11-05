public class MatrixMultiplication2D {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};

        int m=arr1.length;
        int n=arr1[0].length;
        int p=arr2.length;
        int q=arr2[0].length;
        int[][] res=new int[m][q];
        int sum=0;
        if(n==p){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   for(int k=0;k<m;k++){
                       sum+=arr1[i][k]*arr2[k][j];
                   }
                   res[i][j]=sum;
                   sum=0;
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
