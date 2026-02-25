import java.util.ArrayList;

public class QuadraticRoots {
    public static void main(String[] args) {
        QuadraticRoots obj = new QuadraticRoots();
        obj.trailingZeros(25);
    }
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();

        int p=(b*b)-(4*a*c);

        if(p<0){
            list.add(-1);
            return list;
        }

        double x=Math.sqrt(p);

        int res1=(int) Math.floor((-b+x)/(2*a));
        int res2=(int)Math.floor((-b-x)/(2*a));
        list.add(Math.max(res1,res2));
        list.add(Math.min(res1,res2));

        return list;

    }

    public int digitsInFactorial(int n) {
        // code here
        long fact=1L;
        while(n>1){
            fact=fact*n;
            n--;
        }
        int count=0;
        while(fact>0){
            count++;
            fact=fact/10;
        }
        return count;
    }

    public void trailingZeros(int n) {
        int count=0;
        for(int i=5;i<=n;i=i*5){
            count+=n/i;
        }
        System.out.println(count);
    }
}
