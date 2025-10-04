public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,6,6,7,8,9,9,10,10};
        int target = 50;
        System.out.println(LastOccurance.findLast(arr,target));
    }

   static int findLast(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]==target && mid<arr.length-1 && (arr[mid+1]==target)){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
