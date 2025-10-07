import java.util.*;

public class DeloiteQ3 {
    public static void main(String[] args) {
        int[] arr={1223,234,3445,456};
        System.out.println(DeloiteQ3.find(arr));
    }
    public static int find(int[] arr){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int sum = 0;
        int result=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            while(arr[i]>0){
               int CurrentDigit=arr[i]%10;
               list1.add(CurrentDigit);
               arr[i]=arr[i]/10;
            }
            Collections.sort(list1);
            for(int j = 1; j< list1.size()-1; j++){
                sum+= list1.get(j);
            }
            list2.add(i,sum);
            list1.clear();
        }
        for(int x: list2){
            result+=x;
        }
        return result;
    }
}
