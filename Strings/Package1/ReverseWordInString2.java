import java.util.Arrays;

public class ReverseWordInString2 {
    public static void main(String[] args) {
        String str="Welcome to Java DSA";
        str=ReverseWordInString2.find(str);
        System.out.println(str);
    }

    private static String find(String str) {
        char[] chars = str.toCharArray();
       int i=0;
       int j=0;
       while(j<chars.length ) {
           if(chars[j]!=' ') {
               j++;
               if (j == chars.length) {
                   reverseWord(chars, i, j - 1);
               }
           }else if(chars[j]==' ') {
               reverseWord(chars,i,j-1);
               j++;
               i=j;
           }
       }
       reverseArrayWords(chars);
       return new String(chars);
    }

    private static void reverseArrayWords(char[] chars) {
        int i=0;
        int j=chars.length-1;
        while(i<j) {
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
    }

    private static void reverseWord(char[] chars,int i, int j) {
        while(i<j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
}
