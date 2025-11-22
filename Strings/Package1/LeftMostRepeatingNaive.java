public class LeftMostRepeatingNaive {
    public static void main(String[] args) {
        String str1="abbcc";
        System.out.println(LeftMostRepeatingNaive.find(str1));
    }
    public static int find(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
