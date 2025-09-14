package Package2;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr={1,3,2,3,4};
        System.out.println(IsSortedArray.isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
