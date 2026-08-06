class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int k=set.size();
        return atMostKSubarrays(nums,k)-atMostKSubarrays(nums,k-1);
    }

     public int atMostKSubarrays(int[] nums,int k) {
        

        int start=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int end=0;end<n;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            while(map.size()>k){
                 map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                 if(map.get(nums[start])<=0){
                    map.remove(nums[start]);
                 }
                 start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}