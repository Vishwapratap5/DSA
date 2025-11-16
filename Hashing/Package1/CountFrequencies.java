package Package1;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequencies {
    public static void main(String[] args) {
        int[] arr={10,12,10,15,10,20,12,12};
       CountFrequencies.ShowFrequency(arr);
    }

    private static void ShowFrequency(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        System.out.println(hm);
    }
}
