public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};

        int m=arr1.length;
        int n=arr1[0].length;
//        int[][] res=new int[m][n];

            for(int i=0;i<m;i++){
                for(int j=i+1;j<n;j++){
                    int temp=arr1[i][j];
                    arr1[i][j]=arr1[j][i];
                    arr1[j][i]=temp;
                }
            }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
    }
}
