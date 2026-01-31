public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[]nums = {437,315,322,431,686,264,442};
        System.out.println(EvenNoOfDigit.getCount(nums));
    }

    private static int getCount(int[] nums) {
        int count = 0;
        int evenNums=0;
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            while(num>0){
                num=num/10;
                count++;
            }
            if(count%2==0){
                evenNums++;
            }
            count=0;
        }
        return evenNums;
    }
}
