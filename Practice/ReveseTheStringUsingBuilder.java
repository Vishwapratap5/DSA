public class ReveseTheStringUsingBuilder {
    public static void main(String[] args) {
        String s = "Hello World.";
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse().toString());
    }
}
