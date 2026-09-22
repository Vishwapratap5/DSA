class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n+1];
        for(int i=0;i<bookings.length;i++){
            int l=bookings[i][0]-1;
            int r=bookings[i][1]-1;
            int x=bookings[i][2];

            diff[l]+=x;
            diff[r+1]-=x;
        }
        int current=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            current+=diff[i];
            res[i]+=current;
        }
        return res;
      
    }
}