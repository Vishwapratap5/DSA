public class CountInversions {
    public static void main(String[] args) {
        int[] arr={2,5,1,6,8,7};
        CountInversions.divide(arr,0,arr.length);
    }

    private static void divide(int[] arr,int start,int end) {
        if(start<end){
            int mid=start+(end-start)/2;
            divide(arr,start,mid);
            divide(arr,mid+1,end);

            CountInversions.Merge(arr,start,mid,end);
        }
    }

    private static void Merge(int[] arr, int start, int mid, int end) {
        int l=mid-start+1;
        int r=end-mid;
        int[] left=new int[l];
        int[] right=new int[r];
        int Inversions=0;
        for(int i=0;i<l;i++){
            left[i]=arr[start+i];
        }
        for(int j=0;j<r;j++){
            right[j]=arr[mid+1+j];
        }
        int m=0,n=0,k=start;
        while(m<left.length&&n<right.length){
            if(left[m]<=right[n]){
                arr[k++]=left[m++];
                Inversions++;

            }else if(left[m]>right[n]){
                arr[k++]=right[n++];
            }
        }
        while(m<left.length){
            arr[k++]=left[m++];
        }
        while(n<right.length){
            arr[k++]=right[n++];
        }
        System.out.println(Inversions);
    }

}
