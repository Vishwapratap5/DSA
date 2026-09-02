class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        int sum=0;
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int value=0;

        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                value=1;
            }else{
                value=0;
            }
            sum+=value;

            if(sum==goal)count++;
            
            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}