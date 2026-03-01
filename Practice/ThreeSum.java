import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] nums = {3,3,4,7,8};
        List<List<Integer>> res=obj.threeSum(nums,5);
        System.out.println(res.size());
    }

    public List<List<Integer>> threeSum(int[] nums,int d) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> res;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum%d==0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }

                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
    }
}
