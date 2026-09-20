class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff=new int[n+1][n+1];
        int x=1;
        for(int[] q:queries){
            int r1=q[0];
            int c1=q[1];
            int r2=q[2];
            int c2=q[3];

            diff[r1][c1]+=x;
            diff[r1][c2+1]-=x;
            diff[r2+1][c1]-=x;
            diff[r2+1][c2+1]+=x;
        }

        for(int i=0;i<n;i++){
            int val=0;
            for(int j=0;j<n;j++){
                val+=diff[i][j];
                diff[i][j]=val;
            }
        }

        for(int j=0;j<n;j++){
            int val=0;
            for(int i=0;i<n;i++){
                val+=diff[i][j];
                diff[i][j]=val;
            }
        }

        int[][] res=new int[n][n];

        for(int i=0;i<n;i++){
           
            for(int j=0;j<n;j++){
                res[i][j]=diff[i][j];
            }
        }

        return res;
    }
}