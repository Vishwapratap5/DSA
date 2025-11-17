package Package1;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1={10,30,10};
        int[] arr2={5,10,5};

        HashSet<Integer> set1=new HashSet<Integer>();
        for(int a:arr1){
            set1.add(a);
        }
        for(int a:arr2){
            set1.add(a);
        }
        System.out.println(set1);
    }
}
