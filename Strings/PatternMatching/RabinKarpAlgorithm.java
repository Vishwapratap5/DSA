public class RabinKarpAlgorithm {
    public static void main(String[] args) {
        String pattern = "eks";
        String text = "geeksforgeeks";
        RabinKarpAlgorithm.find(text,pattern);
    }

    private static void find(String text, String pattern) {
        int i=0;
        int j=0;
        int m=pattern.length();
        int n=text.length();
        int patternHash=findHash(pattern,0,m-1);
        while(i<=n-m){
            if(j-i+1<m){
                j++;
            }else if(j-i+1==m){
                int txtHash=findHash(text,i,j);
                if(patternHash==txtHash){
                    if(compareChars(text,pattern,i,j)){
                        System.out.println(i);
                    }
                        i++;
                        j++;
                }else{
                   i++;
                   j++;
                }
            }
        }
    }

    private static boolean compareChars(String text, String pattern, int i, int j) {
        for(int k=0;k<pattern.length();k++){
           if(text.charAt(k+i)!=pattern.charAt(k)){
               return false;
           }
        }
        return true;
    }

    private static int findHash(String str,int i, int j) {
        int hash=0;
        for(int k=i;k<=j;k++){
            hash+= str.charAt(k);
        }
        return hash;
    }
}
