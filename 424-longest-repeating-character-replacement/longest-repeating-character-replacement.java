class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int n=s.length();
        int[] freq=new int[26];
        int maxFreq=0;
        int ans=0;
        for(int end=0;end<n;end++){
            freq[s.charAt(end)-'A']++;
            maxFreq=Math.max(maxFreq, freq[s.charAt(end)-'A']);

            while((end - start + 1) - maxFreq>k){
                 freq[s.charAt(start)-'A']--;
                 start++;
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}