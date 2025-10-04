public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,22,55,88,99,101,110,120,130,150,160,170,180,200,500,800,900,1100,1200,1300};
        int target=1100;
        System.out.println(SearchInInfiniteArray.search(target,arr));
    }

    private static int search(int target,int[] arr) {

        int start=0;
        int end=1;
        while(true){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start=end;
                end*=2;
            }else{
                end=mid-1;
            }
        }
    }
}
