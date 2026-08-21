class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int n=arr.length;
       String res=arr[n-1];
       return res.length();
    }
}