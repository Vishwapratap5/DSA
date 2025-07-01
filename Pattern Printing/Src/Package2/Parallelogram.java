package Package2;

public class Parallelogram {
    public static void main(String[] args) {
        Parallelogram.Display(5);
    }

    public  static void Display(int n) {
       int space = 0;
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.print(" * ");
           }
           System.out.println();
           space++;
           for (int j = 0; j < space; j++) {
               System.out.print("  ");
           }
       }
    }
}
