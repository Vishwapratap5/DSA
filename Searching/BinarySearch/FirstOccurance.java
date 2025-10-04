public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        int target = 1;
        System.out.println(FirstOccurance.findFirst(arr,target));
    }

     static int findFirst(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]==target){
                result=mid;
                end=mid-1;

            }
        }
        return result;
    }
}
