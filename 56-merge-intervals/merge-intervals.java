class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        int n=intervals.length;
        int[][] res=new int[n][2];
        int index=0;

        for(int i=1;i<n;i++){
            int start2=intervals[i][0];
             int end2=intervals[i][1];

             if(start2<=end1){
                //merged
                end1=Math.max(end1,end2);
             }else{
                res[index][0]=start1;
                res[index][1]=end1;
                index++;

                start1=start2;
                end1=end2;
             }
        }
        res[index][0]=start1;
        res[index][1]=end1;
        index++;
        
        return Arrays.copyOf(res,index);
    }
}