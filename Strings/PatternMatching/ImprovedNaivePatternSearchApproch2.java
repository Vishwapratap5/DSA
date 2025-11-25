public class ImprovedNaivePatternSearchApproch2 {
    public static void main(String[] args) {
        String pattern = "ABCD";
        String str="ABCEABEFABCD";
        ImprovedNaivePatternSearchApproch2.find(str,pattern);
    }

    private static void find(String str, String pattern) {
        int m=pattern.length();
        int n=str.length();
        int i=0;
        while(i<=n-m){
            int j;
            for(j=0;j<m;j++){
                if(str.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println(i);
            }
            if(j==0){
                i++;
            }else{
                i=i+j;
            }
        }
    }
}
