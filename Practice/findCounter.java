import java.util.Arrays;

public class findCounter {
    public static void main(String[] args) {
        findCounter obj = new findCounter();
        int[] nums={3,2,1,3};
        int[] res=obj.findCounter(nums);
        System.out.println(Arrays.toString(res));
    }

    public int[] findCounter(int[] nums) {
        int[] counter = new int[nums.length];
        counter[0] = 0;
        int j;
        for (int i = 1; i < nums.length; i++) {
             j=i-1;
            while(j>=0){
                if (nums[i] > nums[j]) {
                    counter[i]+=Math.abs(nums[i] - nums[j]);
                }else{
                    counter[i]-=Math.abs(nums[i] - nums[j]);
                }
                j--;
            }
        }
        return counter;
    }
}
