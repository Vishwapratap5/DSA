public class Factorial {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.factorial(5));
    }

    public int factorial(int n) {
        int fact = 1;
        while (n > 1) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
