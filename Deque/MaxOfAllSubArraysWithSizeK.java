import java.util.Arrays;

public class MaxOfAllSubArraysWithSizeK {
    public static void main(String[] args) {
        int[] arr={10,8,5,12,15,7,6};
        int[] res=MaxOfAllSubArraysWithSizeK.find(arr,3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] find(int[] arr,int k) {
        int i=0;
        int j=0;
        int max=0;
        int[] res=new int[arr.length-k+1];
        while(i<arr.length-k+1 && j<arr.length) {
            if(j-i+1<k) {
                j++;
            }else if(j-i+1==k) {
                int m=i;
                while(m<=j){
                    if(arr[m]>max){
                        max=arr[m];
                    }
                    m++;
                }
                res[i]=max;
                max=0;
                i++;
                j++;
            }
        }
        return res;
    }
}
