class Solution {
    public int findLHS(int[] nums) {
        int start=0;
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int end=0;end<n;end++){
           
            int diff=nums[end]-nums[start];
            while(diff>1){
                 start++;
                 diff=nums[end]-nums[start];
            }
            if(diff==1) ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}