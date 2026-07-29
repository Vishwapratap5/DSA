class Solution {
    public int findLHS(int[] nums) {
        int start=0;
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[start];
        int min=nums[start];
        int ans=0;
        for(int end=1;end<n && start<n;end++){
            max=nums[end];
            min=nums[start];
            int diff=max-min;
            while(diff!=1 && diff!=0){
                //max update if window don't contain
                 //min update if window don't contain
                 start++;
                 if(start<n){
                     min=nums[start];
                     diff=max-min;
                 }else{
                    break;
                 }
            }
            if(diff!=0) ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}