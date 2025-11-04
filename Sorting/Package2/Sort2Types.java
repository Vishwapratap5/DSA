import java.util.Arrays;

public class Sort2Types {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Sort2Types.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int start,int end) {
        int i=start-1;
        int j=end+1;

        while(true){
            do{
                i++;
            }while(arr[i]%2==0);
            do{
                j--;
            }while(arr[j]%2!=0);
            if(i>=j){
                return;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
