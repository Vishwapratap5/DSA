public class NaiveApproch {
    public static void main(String[] args) {
        String str="ABCABA";;
        String pattern="ABC";
        NaiveApproch.PatternLoc(str,pattern);
    }

    private static void PatternLoc(String str, String pattern) {
        int patlen=pattern.length();
        int n=str.length();
        int i=0;
        int j=0;
        while(i<n-patlen && j<n) {
           if(j-i+1<patlen){
               j++;
           }else if(j-i+1==patlen){
               int res=isCharsEqual(str,pattern,i,j);
                if(res>=0){
                    System.out.println(res);
                }
                j++;
                i++;
                if(j==n-1){
                    res=isCharsEqual(str,pattern,i,j);
                    if(res>=0){
                        System.out.println(res);
                    }
                }
            }
        }
    }

    private static int isCharsEqual(String str,String pattern,int i, int j) {
        for(int k=i;k<=j;k++){
            if(str.charAt(k)!=pattern.charAt(k-i)){
                return -1;
            }
        }
        return i;
    }
}
