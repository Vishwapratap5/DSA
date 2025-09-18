package Package2;


public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4,2};
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res]){
                res++;
                arr[res]=arr[i];
            }
        }
        for(int i=0;i<=res;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
