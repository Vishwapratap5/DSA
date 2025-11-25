public class ImprovedNaivePatternSearchApproch {
    public static void main(String[] args) {
        String pattern = "ABCD";
        String str="ABCEABEFABCD";
        ImprovedNaivePatternSearchApproch.find(str,pattern);
    }

    private static void find(String str, String pattern) {
        int i=0;
        int j=0;
        while(i<str.length()){
            if(str.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
            if(j==pattern.length()){
                System.out.println(i-j);
                j=0;
            }
        }
    }
}
