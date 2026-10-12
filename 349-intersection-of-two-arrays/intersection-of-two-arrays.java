class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      
      int i=0;
      int j=0;
      HashSet<Integer> set=new HashSet<>();
      
      int n=nums1.length;
      int m=nums2.length;

      while(i<n && j<m){
        if(nums1[i]==nums2[j] && !set.contains(nums1[i])){
            set.add(nums1[i]);
            i++;
            j++;
        }else if(nums1[i]<nums2[j]){
            i++;
        }else{
            j++;
        }
      }

      int p=set.size();
      int[] res=new int[p];
    
      int q=0;
      for(int x:set){
        res[q]=x;
        q++;
      }
      return res;
    }
}