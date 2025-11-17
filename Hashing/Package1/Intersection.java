package Package1;

import java.util.Collections;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        Collections.addAll(set1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        HashSet<Integer> set2 = new HashSet<Integer>();
        Collections.addAll(set2,6, 7, 8, 9, 10);

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
