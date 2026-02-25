package Package2;


import java.util.Arrays;

public class RotateLeftByDPlacesImproved {
   static int[] arr={1,2,3,4,5};
    public static void main(String[] args) {
        int D=3;
        RotateLeftByDPlacesImproved.Rotate(D);
    }

    private static void Rotate(int d) {
        RotateLeftByDPlacesImproved.Reverse(0,d-1);
        RotateLeftByDPlacesImproved.Reverse(d,arr.length-1);
        RotateLeftByDPlacesImproved.Reverse(0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void Reverse(int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
