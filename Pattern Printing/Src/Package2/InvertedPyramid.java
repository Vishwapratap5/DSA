package Package2;

public class InvertedPyramid {
    public static void main(String[] args) {
        InvertedPyramid.Display(5);
    }
    public static void Display(int n) {
        int middle=(n+1)/2;
        int spaces=0;
        for(int i=middle;i>=1;i--)
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
