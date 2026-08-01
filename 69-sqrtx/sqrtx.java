class Solution {
    public int mySqrt(int x) {
      
        long start=0;
        long end=x;
        long res=1;
        while(start<=end){
            long mid=start+(end-start)/2;
            long sqr=mid*mid;
            if(sqr<=x){
              res=mid;
              start=mid+1;
            }else if(sqr>x){
               end=mid-1;
            }
        }
        return (int)res;
    }
}