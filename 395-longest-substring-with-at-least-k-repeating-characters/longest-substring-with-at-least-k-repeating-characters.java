class Solution {
    public int longestSubstring(String s, int k) {
         int n=s.length();
            int ans=0;
        for(int target = 1; target <= 26; target++){

            int left = 0;
            int distinct = 0;
            int atLeastK = 0;
           
            int[] freq = new int[26];

            for(int right = 0; right < n; right++){

                int idx = s.charAt(right) - 'a';

                if(freq[idx] == 0){
                    distinct++;
                }

                freq[idx]++;

                if(freq[idx] == k){
                    atLeastK++;
                }

                while(distinct > target){

                    int remove = s.charAt(left) - 'a';

                    if(freq[remove] == k){
                        atLeastK--;
                    }

                    freq[remove]--;

                    if(freq[remove] == 0){
                        distinct--;
                    }

                    left++;
                }

                if(distinct == target && atLeastK == target){
                    ans = Math.max(ans, right - left + 1);
                }
            }
        }
        return ans;
    }

}