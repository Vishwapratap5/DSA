package Package2;

public class LeftArrowHead {
    public static void main(String[] args) {
        LeftArrowHead.Display(9);
    }
    //n = Number of rows
    public static void Display(int n) {
        int middle = (n + 1) / 2;
        //Upper Half
        for(int i=1;i<=middle;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=middle-1;i++){
            for(int j=i;j<=middle-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
