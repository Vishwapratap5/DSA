class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
       for(;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);

            while(map.get(s.charAt(end))>1){
                map.put(s.charAt(start),map.getOrDefault(s.charAt(start),0)-1);
                start++;
            }

            ans=Math.max(ans,end-start+1);
       }
       return ans;
    }
}