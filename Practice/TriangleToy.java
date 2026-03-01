import java.util.ArrayList;
import java.util.List;

public class TriangleToy {
    public static void main(String[] args) {
        TriangleToy obj = new TriangleToy();
        String[] arr={"221","333","345","113"};
        List<String> ans=obj.check(arr);
        System.out.println(ans);
    }

    public List<String> check(String[] toys){

        List<String> ans = new ArrayList<String>();
        char[] chs;
        int count=0;
        for(int i=0; i<toys.length; i++){
            chs = toys[i].toCharArray();
            int[] nums = new int[chs.length];
            for(int j=0;j<chs.length;j++){
                nums[j]=Character.getNumericValue(chs[j]);
            }
            for(int k=1;k<nums.length;k++){
                if(nums[k]==nums[k-1]){
                    count++;
                }
            }
            if(count==2){
                ans.add("Equilateral");
            }else if(count==1){
                if(nums[0]+nums[1]<nums[2] || nums[1]+nums[2]<nums[0] || nums[2]+nums[0]<nums[1]){
                    ans.add("None");
                }else{
                    ans.add("Isosceles");
                }
            }else{
                ans.add("None");
            }
         count=0;
        }
        return ans;
    }
}
