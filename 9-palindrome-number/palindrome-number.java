class Solution {
    public boolean isPalindrome(int x) {
        int num=x;

        String str=Integer.toString(num);

        int n=str.length();

        int i=0;
        int j=n-1;

        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}