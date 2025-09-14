import java.util.HashSet;
import java.util.Set;

public class lonelyInteger {
    public static void main(String[] args) {
        int[] AR={1,2,3,4,3,2,1};
        int result=lonelyInteger.findUniqueInt(AR);
        System.out.println(result);
    }

    private static int findUniqueInt(int[] ar) {
        Set<Integer> set=new HashSet<>();
        for(int i:ar){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }

        for(int x:set){
            return x;
        }
        return 0;
    }
}
