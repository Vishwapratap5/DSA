import java.util.Arrays;
public class LeftMostRepeatingEfficient1 {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        System.out.println(LeftMostRepeatingEfficient1.find(str1));
    }
    public static int find(String str1) {
      int[] freq = new int[26];
      Arrays.fill(freq,0);
      for(int i=0;i<str1.length();i++){
          freq[str1.charAt(i)-'a']++;
      }
      for(int i=0;i<str1.length();i++){
          if(freq[str1.charAt(i)-'a']>1){
              return i;
          }
      }
      return -1;
    }
}
