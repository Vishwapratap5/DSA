class Solution {
    public int numberOfSubstrings(String s) {
      int start=0;
      int n=s.length();
      int[] freq=new int[26];
      int count=0;
      for(int end=0;end<n;end++){
        char ch=s.charAt(end);
        freq[ch-'a']++;

        while( freq[0]>=1 && freq[1]>=1 && freq[2]>=1){
            count+=n-end;
            freq[s.charAt(start)-'a']--;
            if( freq[s.charAt(start)-'a']<0){
                 freq[s.charAt(start)-'a']=0;
            }
            start++;
        }
      }
      return count;
    }
}