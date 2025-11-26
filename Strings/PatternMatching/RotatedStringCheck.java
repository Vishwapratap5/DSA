public class RotatedStringCheck {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdae";
        System.out.println( RotatedStringCheck.isRotated(s1,s2));
    }

    private static boolean isRotated(String s1, String s2) {
        if(s1.length()!=s2.length())return false;

        return (s1+s1).contains(s2);
    }
}
