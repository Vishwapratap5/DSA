import java.util.Arrays;

public class AnagramSearch {
    public static void main(String[] args) {
        String text="geeksforgeeks";
        String anagram="frogk";
        System.out.println(AnagramSearch.isPresent(text,anagram));
    }

    private static boolean isPresent(String text, String anagram) {
     int[] textFrequencies = new int[256];
     int[] anagramFrequencies = new int[256];
     int m=anagram.length();
     int n=text.length();
     for(int i=0;i<anagram.length();i++) {
         textFrequencies[text.charAt(i)]++;
         anagramFrequencies[anagram.charAt(i)]++;
     }

      if(Arrays.equals(textFrequencies, anagramFrequencies)){
       return true;
      }

        for (int i = m; i < n; i++) {
            // Add new char
            textFrequencies[text.charAt(i)]++;

            // Remove old char
            textFrequencies[text.charAt(i - m)]--;

            // Compare
            if(Arrays.equals(textFrequencies, anagramFrequencies)){
                return true;
            }
        }

        return false;
    }


}
