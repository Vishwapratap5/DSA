class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(row -> row[1]));

        int end1 = pairs[0][1];
        int n = pairs.length;
        int count = 1;

        for(int i=1;i<n;i++){
            int start2 = pairs[i][0];
            int end2 = pairs[i][1];

            if(start2 > end1){
                count++;
                end1 = end2;
            }
        }

        return count;
    }
}