public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;

        while(top<=bottom && left<=right){
            //printing top
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            //printing right column
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;

            //printing bottom
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }

            //printing left column
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
}
