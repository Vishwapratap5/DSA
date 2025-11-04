import java.util.Arrays;
import java.util.Scanner;
public class KSmallest {
    public static void main(String[] args) {
        int[] arr={5,10,9,8,6,13,24,25,69,89};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Which smallest element to find :");
        int k=sc.nextInt();
        System.out.println(arr[k-1]);
    }
}
