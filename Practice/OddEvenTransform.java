import java.util.Arrays;

public class OddEvenTransform {
    public static void main(String[] args) {
        OddEvenTransform obj = new OddEvenTransform();
        int[] arr={3,4,9};
        int[] res=obj.oddEvenTransform(arr,3);
        System.out.println(Arrays.toString(res));
    }

    public int[] oddEvenTransform(int[] arr,int n) {

    if(n%2==0){
        return arr;
    }
            for(int j=0;j<arr.length;j++) {
                if(arr[j]%2==0) {
                    arr[j]-=3;
                }else{
                    arr[j]+=3;
                }
            }

        return arr;
    }
}
