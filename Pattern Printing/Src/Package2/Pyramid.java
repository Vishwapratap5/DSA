package Package2;

public class Pyramid {
    public static void main(String[] args) {
        Pyramid.Display(7);
    }

    public  static void Display(int n) {
        int middle=(n+1)/2;
        int spaces=0;
        for(int i=1;i<=middle;i++)
        {
            spaces=middle-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
