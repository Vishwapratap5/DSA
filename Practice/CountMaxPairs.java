public class CountMaxPairs {

    public static void main(String[] args) {
        CountMaxPairs obj = new CountMaxPairs();
        int[] arr={4,3,5,2};
        System.out.println(obj.countMaxPairs(arr));
    }

    public int countMaxPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]&nums[j]) <(nums[i]^nums[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
