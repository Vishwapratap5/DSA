public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] arr={2,5,8,12,30};
        int target=42;
        System.out.println(TwoPointerApproach.isPresent(arr,target));
    }

    private static boolean isPresent(int[] arr,int target) {
        int i=0;
        int j=arr.length-1;
        while(j>i) {
            if(arr[i]+arr[j]==target) {
                return true;
            }else if(arr[i]+arr[j]>target) {
                j--;
            }else if(arr[i]+arr[j]<target) {
                i++;
            }
        }
        return false;
    }
}
