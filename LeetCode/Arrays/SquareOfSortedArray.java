import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        int[] res=SquareOfSortedArray.get(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] get(int[] arr) {
        int[] res=new int[arr.length];
       int i=0;
       int j=arr.length-1;
       while(i<j){
           int sqr1=Math.abs(arr[i])*Math.abs(arr[i]);
           int sqr2=Math.abs(arr[j])*Math.abs(arr[j]);
           if(sqr1>sqr2){
              res[i]=sqr2;
              res[j]=sqr1;
           }else{
               res[i]=sqr1;
               res[j]=sqr2;
           }
           i++;
           j--;
       }
       return res;
    }
}
