public class SquareRootOptimized {
    public static void main(String[] args) {
        int num=23;
        System.out.println( SquareRootOptimized.sqrt(num));
    }

    private static int sqrt(int num) {
        int start = 0;
        int end = num;
        int sqr;
        int ans=0;
        while(start <= end) {
            int mid=start + (end - start)/2;
            sqr = mid * mid;
            if(sqr == num) {
                return mid;
            }else if(sqr > num) {
                end = mid-1;
            }else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}
