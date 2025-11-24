public class ReverseWordInString {
    public static void main(String[] args) {
        String str="Welcome to Java DSA";
        str=ReverseWordInString.find(str);
        System.out.println(str);
    }

    private static String find(String str) {
        String[] strs = str.split(" ");
        int i=0;
        int j=strs.length-1;
        while(i<j) {
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", strs);
    }
}
