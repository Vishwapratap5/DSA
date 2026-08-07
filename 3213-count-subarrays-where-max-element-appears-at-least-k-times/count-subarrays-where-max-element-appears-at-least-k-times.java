/*class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }

        int start=0;
        int n=nums.length;
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int end=0;end<n;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            while(map.containsKey(max) && map.get(max)>=k){
                count+=n-end;
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                if(map.get(nums[start])<=0){
                    map.remove(nums[start]);
                }
                start++;
            }
        }
        return count;
    }
}*/

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        
        for (int num : nums) maxi = Math.max(maxi, num);
        
        int left = 0;
        long maxiOccurence = 0;
        long res = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == maxi) maxiOccurence++;
           
            while (maxiOccurence >= k) {
                if (nums[left] == maxi) maxiOccurence--;
                left++;
            }
            
            res += left;
        }
        
        return res;
    }
}
