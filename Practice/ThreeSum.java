import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res=obj.find(nums);
    }

    private List<List<Integer>> find(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            while(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                }
            }
        }
        return null;
    }
}
