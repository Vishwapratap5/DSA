package Package1;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 8,3,4,2,5 };
        int sum = 6;
        boolean found = false;
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            int remaining=sum-x;
            if(set.contains(remaining)){
                found = true;
                break;
            }else{
                set.add(x);
            }
        }
        if(found){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
