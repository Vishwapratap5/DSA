import java.util.HashMap;

public class CountErrors {
    public static void main(String[] args) {
        CountErrors countErrors = new CountErrors();
        String[] Products={"a","b","c"};
        double[] actualPrice={2.89,3.29,5.79};
        String[] soldProducts={"a","a","c","b"};
        double[] soldPrice={2.89,2.99,5.97,3.29};
        System.out.println(countErrors.countErrors(Products,actualPrice,soldProducts,soldPrice));
    }

    public int countErrors(String[] products,double[] actualPrice, String[] soldProducts,double[] soldPrice) {
        HashMap<String,Double> map=new HashMap<String, Double>();

        for(int i=0;i<products.length;i++){
            map.put(products[i],actualPrice[i]);
        }
        int errors=0;
        for(int i=0;i<soldProducts.length;i++){
            if(map.get(soldProducts[i])!=soldPrice[i]){
                errors++;
            }
        }
        return errors;
    }
}
