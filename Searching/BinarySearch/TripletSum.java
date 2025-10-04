public class TripletSum {
    public static void main(String[] args) {
        int[] arr={1,2,4,8,16,32};
        int target=28;
        System.out.println(TripletSum.isPresent(arr,target));
    }

    private static boolean isPresent(int[] arr, int target) {
       for(int i=0; i<arr.length; i++){
           int remaining=target-arr[i];
           int start=i+1;
           int end=arr.length-1;
           while(start<end){
               if(arr[start]+arr[end]==remaining){
                   return true;
               }else if(arr[start]+arr[end]<remaining){
                   start++;
               }else{
                   end--;
               }
           }
       }
       return false;
    }
}
