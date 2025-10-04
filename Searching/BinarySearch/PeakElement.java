public class PeakElement {
    public static void main(String[] args) {
        int[] arr={9,10,8,11,7,12,6,5,4,3};
        System.out.println(PeakElement.find(arr));
    }

    private static int find(int[] arr) {
//        int start = 0;
//        int mid=start+1;
//        int end=mid+1;
//        int peak=0;
        if(arr.length==1)
        {
            return arr[0];
        }
        if(arr.length==2){
            return Math.max(arr[0], arr[1]);
        }
//        while(end<arr.length) {
//            if(arr[mid]>arr[end] && arr[mid]>arr[start]) {
//                peak=arr[mid];
//            }else if(arr[start]>arr[mid] && arr[start]>arr[end]) {
//                peak=arr[start];
//            }else{
//                peak=arr[end];
//            }
//                mid++;
//                end++;
//                start++;
//
//        }
//        return peak;
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }
}
