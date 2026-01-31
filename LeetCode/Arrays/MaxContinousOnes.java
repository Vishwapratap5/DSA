

public class MaxContinousOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        int maxCount= MaxContinousOnes.find(arr);
        System.out.println(maxCount);
    }

    private static int find(int[] arr) {

        int maxCount=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
            if(i==arr.length-1){
                maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
