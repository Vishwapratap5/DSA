import java.util.Arrays;

public class MinMovesToReduceStringLeng {
    public static void main(String[] args) {
        MinMovesToReduceStringLeng obj = new MinMovesToReduceStringLeng();
        String str="abababa";
        System.out.println(obj.calculateMoves(str));
    }

    public int calculateMoves(String s) {
        if(s.length() == 0 ){
            return 0;
        }
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
        }
        return count;
    }
}
