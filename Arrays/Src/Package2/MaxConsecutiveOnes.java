package Package2;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,1,1,1,1,1,1,1};
        int count=0;
        int MaxCount=0;
        for (int j : arr) {
            if (j == 1) {
                count++;
            }
            if (j == 0) {
                count = 0;
            }
            if (count > MaxCount) {
                MaxCount = count;
            }

        }
        System.out.println(MaxCount);
    }
}
