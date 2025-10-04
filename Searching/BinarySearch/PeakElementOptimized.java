public class PeakElementOptimized {
    public static void main(String[] args) {
        int[] arr={9,10,8,11,7,12,6,5,4,3};
        System.out.println(PeakElementOptimized.find(arr));
    }

    private static int find(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]) {
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return arr[start];
    }
}
