public class SubsequenceCheck {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ade";
        System.out.println( SubsequenceCheck.check(str1,str2));
    }

    private static boolean check(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
          if(str1.charAt(i)==str2.charAt(j)){
              j++;
          }
            i++;
        }

        return j == str2.length();
    }
}
