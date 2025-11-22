import java.util.Arrays;
import java.util.HashSet;

public class LeftMostRepeatingEfficient2 {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        System.out.println(LeftMostRepeatingEfficient2.find(str1));
    }

    private static int find(String str1) {
       boolean[] arr1=new boolean[256];
      int res=-1;
      for(int i=str1.length()-1;i>=0;i--){
          if(arr1[str1.charAt(i)]==true){
              res=i;
          }else{
              arr1[str1.charAt(i)]=true;
          }
      }
      return res;
    }
}
