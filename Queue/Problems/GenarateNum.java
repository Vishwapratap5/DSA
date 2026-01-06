package Problems;

import java.util.*;

public class GenarateNum {

    public static void generate(int n, int[] digits) {
        Queue<String> q = new ArrayDeque<>();

        for (int d : digits) {
            q.offer(String.valueOf(d));
        }

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");

            for (int d : digits) {
                q.offer(curr + d);
            }
        }
    }

    public static void main(String[] args) {
        int[] digits = {5, 6};
        generate(10, digits);
    }
}
