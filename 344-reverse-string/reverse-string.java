class Solution {
    public void reverseString(char[] s) {
        
        Stack<Character> st=new Stack<>();

        for(char ch:s){
            st.push(ch);
        }

        int n=s.length;
        
        for(int i=0;i<n;i++){
            s[i]=st.pop();
        }
        
    }
}