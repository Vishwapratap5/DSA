package Package2;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,4};
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count+=1;
            }else{
                System.out.println("count of "+arr[i-1]+" is "+count);
                count = 1;
            }

        }
        System.out.println("count of "+arr[arr.length-1]+" is "+count);
    }
}
