package Package2;

public class HollowPyramid {
    public static void main(String[] args) {
        HollowPyramid.Display(5);
    }
    public static void Display(int n) {
        int middle=(n+1)/2;
        int spaces=0;
        for(int i=1;i<=middle;i++)
        {
            spaces=middle-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                for(int l=i+1;l<middle-1;l++){
                    System.out.print(".");
                }

            }
            System.out.println();
        }

    }

}
