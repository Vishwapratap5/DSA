class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int xor=0;
        int[] preXOR=new int[n];
        preXOR[0]=arr[0];

        for(int i=1;i<n;i++){
            preXOR[i]=preXOR[i-1]^arr[i];
        }

        int[] res=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];

            if(start==0){
                res[i]=preXOR[end];
            }else{
                res[i]=preXOR[end]^preXOR[start-1];
            }
           
        }
        return res;

    }
}