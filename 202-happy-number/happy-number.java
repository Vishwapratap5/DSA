class Solution {
    public boolean isHappy(int n) {
        
        int slow=n;
        int fast=n;

        while(fast!=1){
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));

            if(fast==1){
                return true;
            }
            if(slow==fast){
                return false;
            }
        }
        return true;
    }

    public int squareSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            int sqr=digit*digit;
            sum+=sqr;
            n/=10;
        }
        return sum;
    }
}