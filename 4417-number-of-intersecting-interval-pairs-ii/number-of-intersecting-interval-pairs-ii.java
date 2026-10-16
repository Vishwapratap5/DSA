class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;

        int[] starts=new int[n];
        int[] ends=new int[n];

        for(int i=0;i<n;i++){
            starts[i]=intervals[i][0];
            ends[i]=intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

       
        long total=0;
        
        for(int i=0;i<n;i++){
             int L = intervals[i][0];
            int R = intervals[i][1];

            long count = upperBound(starts, R)
                       - lowerBound(ends, L);
            total+=count;
        }
        return (total-n)/2;
    }

    public static int upperBound(int[] starts,int x){
        int start=0;
        int n=starts.length;
        int end=n-1;
        int res=n;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(starts[mid]>x){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        return res;
    }
    
     public static int lowerBound(int[] starts,int x){
        int start=0;
        int n=starts.length;
        int end=n-1;
        int res=n;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(starts[mid]>=x){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        return res;
    }
}