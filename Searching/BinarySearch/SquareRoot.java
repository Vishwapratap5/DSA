public class SquareRoot {
    public static void main(String[] args) {
        int i=1;
        int sqrt =0;
        int num=225;
        int count=0;
        while(sqrt*sqrt<=num) {
            sqrt++;
            count++;
        }
        System.out.println(count-1);
    }
}
