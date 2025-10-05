import java.util.Arrays;

public class MissingAndRepeatingElement {
    public static void main(String[] args) {
        int[] arr={1,5,6,2,3,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("repeatingElement= "+arr[i]);
            }
            if(arr[i]!=(i+1)){
                System.out.println("MissingElement= "+(i+1));
            }
        }
    }
}
