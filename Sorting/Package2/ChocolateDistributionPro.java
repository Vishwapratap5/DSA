import java.util.Arrays;

public class ChocolateDistributionPro {
    public static void main(String[] args) {
        int[] arr={3,4,1,9,56,7,9,12};
        int m=5;
        ChocolateDistributionPro.printDistribution(arr,m);
    }

    private static void printDistribution(int[] arr, int m) {
        int start=0;
        int end=0;
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while(end<arr.length){
            if(end-start+1<m){
                end++;
            }else if(end-start+1==m){
                mindiff=Math.min(mindiff,arr[end]-arr[start]);
                start++;
                end++;
            }
        }
        System.out.println(mindiff);

    }
}
