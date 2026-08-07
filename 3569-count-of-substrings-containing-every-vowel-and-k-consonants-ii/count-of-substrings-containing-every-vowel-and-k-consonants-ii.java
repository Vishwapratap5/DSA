class Solution {
    public long countOfSubstrings(String word, int k) {
       return atLeast(word, k)-atLeast(word,k+1);
    }

    public long atLeast(String word, int k){
         int start=0;
        int n=word.length();
        long count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int consonants=0;
        for(int end=0;end<n;end++){
            char ch=word.charAt(end);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }else{
                consonants++;
            }

           while(map.size()==5 && consonants>=k){
                count+=n-end;  
                if(word.charAt(start)=='a' || word.charAt(start)=='e'|| 
                    word.charAt(start)=='i'|| word.charAt(start)=='o'|| 
                    word.charAt(start)=='u')
                    {
                        map.put(word.charAt(start),map.getOrDefault(word.charAt(start),0)-1);
                        if(map.get(word.charAt(start))<=0){
                            map.remove(word.charAt(start));
                        }
                    }else{
                        consonants--;
                    }  
                    start++;
           }
        }
        return count;
    }
}