package Package2;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr={5,32,31,25,65,55};
        int resMax1 =Integer.MIN_VALUE;
        int resMax2 =Integer.MIN_VALUE;
        for(int num:arr){
            if(num>resMax1){
                resMax2=resMax1;
                resMax1=num;
            }else if(num>resMax2 && num!=resMax1){
                resMax2=num;
            }
        }
        if(resMax2==Integer.MIN_VALUE){
            System.out.println("No 2nd largest element found");
        }else{
            System.out.println("2nd Largest element: "+resMax2);
        }

    }
}
