class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n=intervals.length;
        int[][]  newIntervals =new int[n+1][2];
        int req=newInterval[0];

        int i=0;
        for(;i<n;i++){
            if(intervals[i][0]>req){
                break;
            }
            newIntervals[i][0]=intervals[i][0];
            newIntervals[i][1]=intervals[i][1];
        }

        newIntervals[i][0]=newInterval[0];
        newIntervals[i][1]=newInterval[1];

      int j=i+1;
       for(;i<n;i++){
            
            newIntervals[j][0]=intervals[i][0];
            newIntervals[j][1]=intervals[i][1];
            j++;
       }

       int start1=newIntervals[0][0];
       int end1=newIntervals[0][1];
       int[][] res=new int[n+1][2];
       int index=0;

       for(int k=1;k<n+1;k++){
        int start2=newIntervals[k][0];
        int end2=newIntervals[k][1];

        if(start2<=end1){
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