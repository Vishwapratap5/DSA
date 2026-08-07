class Solution {
    public int numberOfSubstrings(String s, int k) {
        int start=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int end=0;end<n;end++){
            char ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.containsKey(ch) && map.get(ch)>=k){
                count+=n-end;
                map.put(s.charAt(start),map.getOrDefault(s.charAt(start),0)-1);
                if(map.get(s.charAt(start))<=0){
                    map.remove(s.charAt(start));
                }
                start++;
            }
        }
        return count;
    }
}