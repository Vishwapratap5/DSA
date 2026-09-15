class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] prefix=new int[n];
        prefix[0]=isValid(words[0])?1:0;
        int val=0;
        int[] res=new int[queries.length];

        for(int i=1;i<n;i++){
            val=isValid(words[i])?1:0;
            prefix[i]=prefix[i-1]+val;
        }

         for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];

            if(start==0){
                res[i]=prefix[end];
            }else{
                res[i]=prefix[end]-prefix[start-1];
            }
           
        }

        return res;

    }

    public boolean isValid(String word){
        boolean startsWith=false;
         boolean endsWith=false;

        if(word.startsWith("a") || word.startsWith("e") ||word.startsWith("i") ||word.startsWith("o") ||word.startsWith("u")){
            startsWith=true;
        }

        if(word.endsWith("a") || word.endsWith("e") ||word.endsWith("i") ||word.endsWith("o") ||word.endsWith("u")){
            endsWith=true;
        }

        return endsWith &&startsWith;
    }
}