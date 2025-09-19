package Package2;

import java.util.Arrays;

public class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int start=0;
        int end=arr.length-1;

        if(k<arr.length){
            for(int i=start;i<end;i++){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
            }
        }
        for(int i=start;i<=end;i+=k){
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr={1,2,3,4,5,6,7,8,9};
        solution.reverseInGroups(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}