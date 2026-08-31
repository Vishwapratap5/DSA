class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int k=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        int len=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                sum+=1;
            }else if(nums[i]==0){
                sum-=1;
            }

            if(sum==k){
                len=i+1;
                maxLen=Math.max(maxLen,len);
            }

            if(map.containsKey(sum-k)){
                len=i-map.get(sum-k);
                maxLen=Math.max(maxLen,len);
            }
            map.putIfAbsent(sum,i);
        }
        return maxLen;
    }
}