class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int start=0;
        int n=answerKey.length();
        int[] freq=new int[26];
        int maxCount=0;
        int ans=0;
        for(int end=0;end<n;end++){
            freq[answerKey.charAt(end)-'A']++;
            maxCount=Math.max(maxCount,freq[answerKey.charAt(end)-'A']);

            while((end-start+1)-maxCount>k){
                freq[answerKey.charAt(start)-'A']--;
                start++;
            }
            ans=Math.max(end-start+1,ans);
        }
        return ans;
    }
}