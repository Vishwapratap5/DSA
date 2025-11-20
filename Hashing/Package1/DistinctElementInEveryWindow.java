package Package1;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementInEveryWindow {
    public static void main(String[] args) {
        int[] arr={10,10,30,40,50};
        int k=4;
        DistinctElementInEveryWindow.find(arr,k);
    }

    private static void find(int[] arr, int k) {
        int i=0;
        int j=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(j<arr.length) {
            hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                System.out.println(hm.size());
                hm.put(arr[i], hm.get(arr[i])-1);
                if (hm.get(arr[i]) == 0) hm.remove(arr[i]);
                i++;
                j++;
            }
        }
    }
}
