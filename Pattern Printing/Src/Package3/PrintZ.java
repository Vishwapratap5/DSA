package Package3;

public class PrintZ {
    public static void main(String[] args) {
        int space=3;
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=5;j++)
           {
               if(i==1 || i==5)
               {
                    System.out.print("*");
               }else if(j==6-i){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }

           System.out.println();
        }
    }
}
