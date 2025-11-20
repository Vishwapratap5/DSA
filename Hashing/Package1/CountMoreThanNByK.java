package Package1;

import java.util.HashMap;
import java.util.Map;

public class CountMoreThanNByK {
    public static void main(String[] args) {
        int[] arr={30,10,20,30,30,40,30,40,30};
        int k=4;
        CountMoreThanNByK.find(arr,k);
    }

    private static void find(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }
        int n=arr.length;
        System.out.println(hm);
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>n/k){
                System.out.println(entry.getKey());
            }
        }
    }
}
