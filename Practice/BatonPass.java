import java.util.ArrayDeque;
import java.util.Arrays;

public class BatonPass {
    public static void main(String[] args) {
        BatonPass obj = new BatonPass();
        int[] res=obj.batonPass(4,5);
        System.out.println(Arrays.toString(res));
    }

    public int[] batonPass(int friends,int time) {
        int longCycle=2*friends-1;
        int pos=friends%longCycle;
        boolean forword;
        int current;
        if(friends>time){
            current=pos+1;
            forword=true;
        }else{
            current=2*friends-pos-1;
            forword=false;
        }
        int next=(forword)?current+1:current-1;

        return new int[]{current,next};
    }
}
