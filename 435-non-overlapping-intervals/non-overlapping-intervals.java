class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,Comparator.comparingInt(row->row[0]));

        int start1=intervals[0][0];
        int end1=intervals[0][1];

        int count=0;

        for(int i=1;i<n;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(start2<end1){
                end1 = Math.min(end1, end2);
                count++;
            }else{
                start1=start2;
                end1=end2;
            }
        }
        return count;
    }
}