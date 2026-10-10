class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];

        int start=firstOccurance(nums,target);
         int end=lastOccurance(nums,target);
         res[0]=start;
         res[1]=end;
         return res;
    }
    public int firstOccurance(int[] nums,int target){
        int n=nums.length;
        if(n==0){
            return -1;
        }
        int start=0;
        int end=n-1;
        int res=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                 res=mid;
                 end=mid-1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }

     public int lastOccurance(int[] nums,int target){
        int n=nums.length;
        if(n==0){
            return -1;
        }
        int start=0;
        int end=n-1;
        int res=-1;

        while(start<=end){
              int mid=start+(end-start)/2;

            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
}