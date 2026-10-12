class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        ArrayList<Integer> list=new ArrayList<>();
    
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;

       while (i < n && j < m) {
    if (nums1[i] <= nums2[j]) {
        list.add(nums1[i]);
        i++;
    } else {
        list.add(nums2[j]);
        j++;
    }
}

        if(j<m){
            while(j<m){
                list.add(nums2[j]);
                j++;
            }
        }else if(i<n){
            while(i<n){
                list.add(nums1[i]);
                i++;
            }
        }

        int size=list.size();

        if(size%2!=0){
            return (double) list.get(size/2);
        }else{
            int mid=size/2;
            int n1=list.get(mid);
            int n2=list.get(mid-1);

            return (double) ((double)n1+n2)/2;
        }
    }
}