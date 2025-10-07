public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int target=4;
        System.out.println("Ceiling of the number is : "+CeilingOfNumber.find(arr,target));
    }

    private static int find(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
