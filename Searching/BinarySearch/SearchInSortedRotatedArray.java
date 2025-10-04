public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2};
        int target=6;
        System.out.println(SearchInSortedRotatedArray.search(target,arr));
    }

    private static int search(int target,int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) {
                return mid;
            }else if(arr[mid]>=arr[start]) {
                if(target<=arr[mid] && target>=arr[start]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>=arr[mid] && target<=arr[end]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
