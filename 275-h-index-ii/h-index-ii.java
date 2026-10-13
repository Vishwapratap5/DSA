class Solution {
    public int hIndex(int[] citations) {
    
      int n=citations.length;
      for(int i=n;i>=0;i--){
        int val=upperBound(citations,i);
        if(i<=n-val){
            return i;
        }
      }
      return -1;

    }

    public int upperBound(int[] arr,int target){
        int start=0;
        int n=arr.length;
        int end=n-1;
        int res=n;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>=target){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
}