public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb.capacity());
        sb.replace(2,4,"Guru");
        System.out.println(sb);
    }
}
