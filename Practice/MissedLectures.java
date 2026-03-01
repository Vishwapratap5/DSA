import java.util.HashSet;

public class MissedLectures {
    public static void main(String[] args) {
        MissedLectures obj = new MissedLectures();
        System.out.println(obj.findCountOfMissedLectures(4,1,10));
    }

    public int findCountOfMissedLectures(int numChapters,int b,int e) {
//        int missedLecture;
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = b ; i <= e ; i++){
//            missedLecture = i%numChapters;
//            if(!set.contains(missedLecture)){
//                set.add(missedLecture);
//            }
//        }
        int missedLectures = e-b+1;
        if(missedLectures<numChapters){
            return missedLectures;
        }else{
            return numChapters;
        }
    }
}
