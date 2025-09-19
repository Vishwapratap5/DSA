package Package2;

import java.util.Arrays;

public class MiniumFlips {
    public static void main(String[] args) {
        int[] arr={1,0,0,0,0,0,0};
        int countOfOne=0;
        int countOfZero=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                countOfOne++;

            }else{
                countOfZero++;

            }
        }
        int min= countOfOne<countOfZero?1:0;
        int max= countOfOne>countOfZero?1:0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=max;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
