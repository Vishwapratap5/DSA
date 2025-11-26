    import java.util.Arrays;

    public class LPS {
        public static void main(String[] args) {
            String pattern = "ababa";
            System.out.println(Arrays.toString(LPS.find(pattern)));
        }

        public static int[] find(String pattern) {
            int m = pattern.length();
            int[] lps=new int[m];
            lps[0]=0;
            int i=1;
            int j=0;
            while(i<m) {
                if(pattern.charAt(i)==pattern.charAt(j)) {
                    j++;
                    lps[i]=j;
                    i++;
                }else{
                    if(j!=0){
                        j=lps[j-1];
                    }else{
                        lps[i]=0;
                        i++;
                    }
                }
            }
            return lps;
        }
    }
