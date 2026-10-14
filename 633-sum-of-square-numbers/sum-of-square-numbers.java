class Solution {
    public boolean judgeSquareSum(int c) {
        boolean isFound=false;
        for(long i=0;i*i<=c;i++){
            long val=i*i;
            long rem=c-val;
            if (search(c, rem)) {
                return true;
            }
        }
        return isFound;
    }

    public boolean search(long n,long rem){
        long start=0;
        long end=n;

        while(start<=end){
            long mid=start+(end-start)/2;
            long square=mid*mid;
            if(rem==square){
                return true;
            }else if(rem>square){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}