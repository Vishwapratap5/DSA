class Solution {
    public int maxScore(String s) {
        int zeroCnt=0;
        int oneCnt=0;
        int total=0;
        int n=s.length();
        int max=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                total++;
            }
        }
        if(total==0){
            return 1;
        }
         for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zeroCnt++;
            }else{
                oneCnt++;
            }
            max=Math.max(max,zeroCnt+(total-oneCnt));
        }
        return max;
    }
}