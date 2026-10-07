class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals,Comparator.comparingInt((int[] row) -> row[0])
              .thenComparingInt(row -> -row[1]));
        int n=intervals.length;
        
        long start1=intervals[0][0];
        long end1=intervals[0][1];
        int covered=0;

        for(int i=1;i<n;i++){
            long start2=intervals[i][0];
            long end2=intervals[i][1];

            if(start2<=end1){
                if(end2<=end1){
                    covered++;
                }
                end1=Math.max(end1,end2);
            }else{
                start1=start2;
                end1=end2;
            }
        }
        return n-covered;
        
    }
}