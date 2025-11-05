public class TraverseInSnakePattern {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr1.length;
        int n=arr1[0].length;
        for(int i=0;i<m;i++){
          if(i%2==0){
              for(int j=0;j<n;j++){
                  System.out.print(arr1[i][j]+" ");
              }
          }else if(i%2!=0){
              for(int j=n-1;j>=0;j--){
                  System.out.print(arr1[i][j]+" ");
              }
          }
          System.out.println();
        }
    }
}
