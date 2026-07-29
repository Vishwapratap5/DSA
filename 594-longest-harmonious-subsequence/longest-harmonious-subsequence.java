class Solution {
    public int findLHS(int[] nums) {
        int start=0;
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[start];
        int min=nums[start];
        int ans=0;
        for(int end=1;end<n && start<n;end++){
           
            int diff=nums[end]-nums[start];
            while(diff>1){
                 start++;
                 diff=nums[end]-nums[start];
            }
            if(diff!=0) ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}