package Package2;

public class MaximumFromSubArraysOfSizeK {
    public static void main(String[] args) {
        int[] arr={5,4,8,9,3,4,5,6,9};
        int k=3;
        MaximumFromSubArraysOfSizeK.findMax(arr,k);
    }

    private static void findMax(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int n = arr.length;
        int Currentmax = Integer.MIN_VALUE;
        while(end<n){
            Currentmax = Math.max(Currentmax,arr[end]);
            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                System.out.println(Currentmax);
                end++;
                start++;
            }
        }
    }
}
