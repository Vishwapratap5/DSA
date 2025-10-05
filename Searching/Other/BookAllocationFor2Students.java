public class BookAllocationFor2Students {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,4,5};
        System.out.println(BookAllocationFor2Students.minAllocation(arr));
    }

    private static int minAllocation(int[] arr) {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        System.out.println(sum);
        int min=Integer.MIN_VALUE;
        int CurrentSum=0;
        int RemianingSum=0;
        int lastMin=-1;
        for(int x:arr){
            CurrentSum+=x;
            RemianingSum=sum-CurrentSum;
            lastMin=min;
            min=Math.max(CurrentSum,RemianingSum);
            lastMin=Math.min(lastMin,min);
        }
        return lastMin;
    }
}
