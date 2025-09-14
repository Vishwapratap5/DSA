package Package2;


public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30,40};
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
