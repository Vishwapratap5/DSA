package Package2;

public class Dimond {
    public static void main(String[] args) {
        Dimond.Display(5);
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
        for(int i=middle+1;i<=n;i++){
            spaces=i-middle;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(n-i+1)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
