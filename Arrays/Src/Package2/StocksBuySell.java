package Package2;

public class StocksBuySell {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int buyIndex=0;
        int sellIndex=0;
        int profit=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[buyIndex]){
                buyIndex=i;
            }
        }

        sellIndex = buyIndex;
        for(int i = buyIndex; i < n; i++){
            if(arr[i] > arr[sellIndex]){
                sellIndex = i;
            }
        }

        System.out.println(sellIndex+" "+buyIndex);
        profit=arr[sellIndex]-arr[buyIndex];
        if(profit>0){
            System.out.println(profit);
        }else{
            System.out.println("No Transaction");
        }
    }
}
