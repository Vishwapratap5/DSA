class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n = nums2.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i = 0; i < nums2.length; i++) {

            while(!st.isEmpty() && nums2[i] > nums2[st.peek()]) {

                int index = st.pop();

                ans[index] = nums2[i];
                map.put(nums2[index],nums2[i]);
            }

            st.push(i);
        }
    
        

        while(!st.isEmpty()) {
            int index=st.pop();
            ans[index] = -1;
            map.put(nums2[index],-1);
        }

        int[] res=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }

        return res;
    }
}

