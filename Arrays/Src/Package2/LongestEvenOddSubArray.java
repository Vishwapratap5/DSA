package Package2;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,2,2};
        int count=1;
        int maxLength=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0 && arr[i+1]%2!=0 || arr[i]%2!=0 && arr[i+1]%2==0) {
                count++;
                if (count > maxLength) {
                    maxLength = count;
                }
            }else{
                count=1;
            }
        }
        System.out.println(maxLength);
    }
}
