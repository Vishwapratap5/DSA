public class LongestMountain {
    public static void main(String[] args) {
        LongestMountain  obj=new LongestMountain();
        System.out.println(obj.longestMountain(new int[]{1,1,3,4,3,2,1}));
    }

    public int longestMountain(int[] A) {
        int i=0;
        int n=A.length;
        int max=0;
        while(i<n){
            while(i+1<n && A[i]>=A[i+1]){
                i++;
            }
            int up=0;
            int down=0;

            while(i+1<n && A[i]<A[i+1]){
                up++;
                i++;
            }

            while(i+1<n && A[i]>A[i+1]){
                down++;
                i++;
            }

            if(up>0 && down>0){
                max=Math.max(max,up+down+1);
            }else{
                i++;
            }

        }

        return max;
    }
}
