public class SequenceSum {
    public static void main(String[] args) {
        SequenceSum obj = new SequenceSum();
        System.out.println(obj.sequenceSum(5,9,6));
    }

    public int sequenceSum(int i, int j, int k) {
        int sum = 0;
        if(j>i){
//            while(i<=j){
//                sum+=i;
//                i++;
//            }
//            i-=2;
//            while(i>=k){
//                sum+=i;
//                i--;
//            }

            for(int m=i;m<=j;m++){
                sum+=m;
            }
            for(int n=j-1;n>=k;n--){
                sum+=n;
            }

        }
        return sum;
    }
}
