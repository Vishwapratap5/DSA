package Package2;

public class Rhombus {

        public static void main(String[] args) {
           Rhombus.Display(5);
        }

        public  static void Display(int n) {

            for (int i = 0; i < n; i++) {
                for(int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(" * ");
                }
                System.out.println();

            }
        }


}
