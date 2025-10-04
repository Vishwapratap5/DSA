package Package2;

public class FirstNegativeNumInKSizeSubArray {
    public static void main(String[] args) {
        int[] arr={-1,3,5,4,6,-8,-9,5,0,2,-2,8};
        int k=3;
        FirstNegativeNumInKSizeSubArray.findFirstNegativeNum(arr,k);
    }

    private static void findFirstNegativeNum(int[] arr, int k) {
        int start=0,end = 0,first=0;
        int n=arr.length;
        while(end<n){
            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                int flag=0;
                for(int i=start;i<=end;i++){
                    if(arr[i]<0){
                        System.out.println(arr[i]);
                        flag=1;
                        break;
                    }
                }
                if(flag!=1){
                    System.out.println("0");
                }
                end++;
                start++;
            }
        }
    }
}
