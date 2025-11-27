import java.util.Arrays;

public class LongestSubStringWithDistinctChar {
    public static void main(String[] args) {
        String text = "abcad";
        System.out.println( LongestSubStringWithDistinctChar.findCount(text));
    }

    private static int findCount(String text) {
        int left = 0, right = 0, count = 0,maxlen=0;
     for(int i = 0; i < text.length()-1; i++) {
         if(text.charAt(i) != text.charAt(i+1)) {
             left++;
         }else{
             if(areDifferent(text,left,right)){
                 maxlen=Math.max(maxlen,right-left+1);
             }else{
                 right++;
             }
         }
     }
     return maxlen;
    }

    private static boolean areDifferent(String text,int left, int right) {
        for(int i = left; i <= right; i++) {
            if(text.charAt(i) == text.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
