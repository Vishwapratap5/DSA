import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class MissingPrisoner {
    public static void main(String[] args) {
        MissingPrisoner obj = new MissingPrisoner();
        int[][] prisoners={{1,1},{1,2},{2,1},{4,4},{4,6},{9,4},{9,6}};
        int[] res=obj.missingPrisoner(prisoners);
        System.out.println(Arrays.toString(res));
    }

    public int[] missingPrisoner(int[][] nums) {
       int x=0;
       int y=0;

       for(int i=0;i<nums.length;i++){
           x^=nums[i][0];
           y^=nums[i][1];
       }

       return new int[]{x,y};
    }
}
