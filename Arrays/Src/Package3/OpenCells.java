package Package3;

import java.util.Arrays;

public class OpenCells {
    public static void main(String[] args) {
        int[] arr=new int[102];
        Arrays.fill(arr,1);
        //1=closed
        //0=open
        int[] result=OpenCells.CalculateResult(arr);
        for(int x:result){
            System.out.print(x+" ");
        }
    }

    private static int[] CalculateResult(int[] arr) {
        int round=1;
        for(int i=1;i<=arr.length-2;i++){

        }
        return arr;
    }
}
