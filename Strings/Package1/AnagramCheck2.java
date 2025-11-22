import java.util.Arrays;

public class AnagramCheck2 {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        System.out.println(AnagramCheck2.check(str1,str2));
    }

    private static boolean check(String str1, String str2) {
        int[] count=new int[26];
        Arrays.fill(count,0);
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
