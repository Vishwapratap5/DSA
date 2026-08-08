class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
         int start=0;
        int end=0;
        int n=arr.length;
        int[] res=new int[n-k+1];
        int i=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        while(end<n){
           
            map.put(arr[end],map.getOrDefault(arr[end],0)+1);
            if(end-start+1<k){
                end++;
            }else  if(end-start+1==k){
                res[start]=map.lastKey();
                map.put(arr[start],map.getOrDefault(arr[start],0)-1);
                if(map.get(arr[start])<=0){
                    map.remove(arr[start]);
                }
                start++;
                end++;
               // i++;
            }
        }
        return res;
    }
}