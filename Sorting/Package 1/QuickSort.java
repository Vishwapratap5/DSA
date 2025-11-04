import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        QuickSort.sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr,int start,int end) {
        if(start<end) {
            int pivot = partition(arr,start,end);
            sort(arr,start,pivot);
            sort(arr,pivot+1,end);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr,int start,int end) {
        int pivot=arr[start];
        int i=start-1;
        int j=end+1;

        while(true) {
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(j<=i) {
                return j;
            }
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
