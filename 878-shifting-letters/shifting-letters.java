class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        long[] diff=new long[n+1];

        for(int i=0;i<n;i++){
            int l=0;
            int r=i;

            diff[l]+=shifts[i];
            diff[r+1]-=shifts[i];
        }
        long[] prefix=new long[n];
        prefix[0]=diff[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+diff[i];
        }
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();

        for(int i=0;i<n;i++){
            long p=((ch[i]+prefix[i])-'a')%26;
            sb.append((char)(p+'a'));
        }
        return sb.toString();
    }
}