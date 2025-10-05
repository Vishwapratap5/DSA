import java.util.Arrays;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr ={0,2,1,3,2,2};
        System.out.println( RepeatingElement.find(arr));
    }

    private static int find(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
