class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        HashSet<Integer> set=new HashSet<>();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(!st.isEmpty()){
                     st.pop();
                }else{
                    set.add(i);
                }
            }
        }

        if(!st.isEmpty()){
            while(!st.isEmpty()){
                set.add(st.pop());
            }
        }

        for(int i=0;i<n;i++){
           
           if(set.contains(i)){
            continue;
           }else{
            sb.append(s.charAt(i));
           }
        }

        return sb.toString();

    }
}