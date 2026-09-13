class Solution {
  long MOD = 1_000_000_007;


    public int numOfSubarrays(int[] arr) {
        int start=0;
        int n=arr.length;
        long count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        map.put(1,0);

        for(int end=0;end<n;end++){
            sum+=arr[end];

            if(sum%2!=0){
                count+=map.get(0);
                map.put(1,map.getOrDefault(1,0)+1);
            }else{
                 count+=map.get(1);
                map.put(0,map.getOrDefault(0,0)+1);
            }
           
        }
        return (int) ((count % MOD + MOD) % MOD);
    }
}