public class BoundryTraversal {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};

        int m = arr1.length;
        int n = arr1[0].length;
        if(m==1){
            for(int i=0; i<n; i++){
                System.out.println(arr1[0][i]);
            }
        }else if(n==1){
            for(int i=0; i<m; i++){
                System.out.println(arr1[i][0]);
            }
        }else{
            // Top row
            for (int j = 0; j < n; j++)
                System.out.print(arr1[0][j] + " ");

            // Right column
            for (int i = 1; i < m; i++)
                System.out.print(arr1[i][n - 1] + " ");

            // Bottom row
            for (int j = n - 2; j >= 0; j--)
                System.out.print(arr1[m - 1][j] + " ");

            // Left column
            for (int i = m - 2; i > 0; i--)
                System.out.print(arr1[i][0] + " ");
        }
        }

}



