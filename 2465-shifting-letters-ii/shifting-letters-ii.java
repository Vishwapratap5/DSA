class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       int n=s.length();
       int[] diff=new int[n+1];
       char[] ch=s.toCharArray();

       for(int i=0;i<shifts.length;i++){
            int l=shifts[i][0];
            int r=shifts[i][1];
            int direction=shifts[i][2];

            if(direction==1){
                diff[l]+=1;
                diff[r+1]-=1;
            }else{
                diff[l]-=1;
                diff[r+1]+=1;
            }
       } 
       int[] prefix=new int[n];
       prefix[0]=diff[0];
       for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]+diff[i];
       }
        StringBuilder sb=new StringBuilder();
       for(int i=0;i<n;i++){
        
        int p=ch[i]+prefix[i];
        p=(p-'a')%26;
        if(p<0){
            p+=26;
        }
        sb.append((char)(p+'a'));
       }
       return sb.toString();
    }
}