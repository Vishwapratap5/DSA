import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        DutchNationalFlag obj = new DutchNationalFlag();
        int[] arr={1,0,0,2,2,1};
        obj.sort(arr);
    }

    public void sort(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(mid<=end){

            switch(arr[mid]){
                case 0:
                    int temp=arr[mid];
                    arr[mid]=arr[start];
                    arr[start]=temp;
                    start++;
                    mid++;
                    break;

                    case 1:
                        mid++;
                        break;

                        case 2:
                            int temp1=arr[mid];
                            arr[mid]=arr[end];
                            arr[end]=temp1;
                            end--;
                            break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
