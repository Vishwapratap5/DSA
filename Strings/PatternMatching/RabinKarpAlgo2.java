public class RabinKarpAlgo2 {
    public static void main(String[] args) {
        String text="abcabcd";
        String pattern="abcd";
        RabinKarpAlgo2.printPos(text,pattern);
    }

    private static void printPos(String text, String pattern) {
        int h=1;
        int d=256;
        int q=253;
        int m=pattern.length();
        int n=text.length();
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }
        int textHash=0;
        int patternHash=0;
        for(int i=0;i<m;i++){
            patternHash=(d*patternHash+(pattern.charAt(i)))%q;
            textHash=(d*textHash+text.charAt(i))%q;
        }
        for(int i=0;i<=n-m;i++){
            if(patternHash==textHash){
                int k;
                for(k=0;k<m;k++){
                    if(text.charAt(i+k)!=pattern.charAt(k)){
                        break;
                    }
                }
                if(k==m){
                    System.out.println(i);
                }
            }
            if(i<n-m){
                textHash=(d*(textHash-text.charAt(i)*h)+text.charAt(i+m))%q;
            }
            if(textHash<0){
                textHash+=q;
            }
        }
    }
}
