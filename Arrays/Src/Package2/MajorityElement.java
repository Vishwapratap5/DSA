package Package2;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,4,4};
        int n=arr.length;
        int count=0;
        int maxcount=0;
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
              index=i;
              break;
            }

            count=0;
        }
        System.out.println(maxcount+" "+index);
    }
}

