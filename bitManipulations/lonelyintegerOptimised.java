import java.util.HashSet;
import java.util.Set;

public class lonelyintegerOptimised {
    public static void main(String[] args) {
        int[] AR={1,2,3,4,3,2,1,4,5};
        int result= lonelyintegerOptimised.findUniqueInt(AR);
        System.out.println(result);
    }

    private static int findUniqueInt(int[] ar) {
       int result=0;
        for(int i:ar){
            result^=i;
        }
        return result;
    }
}
