package Package2;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4,4};
        int n=arr.length;
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    maxcount=Math.max(maxcount,count);
                }
            }
            System.out.println("Count of "+arr[i]+" is "+maxcount);
            count=0;
        }
    }
}

