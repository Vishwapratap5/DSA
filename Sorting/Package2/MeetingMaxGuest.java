import java.util.Arrays;

public class MeetingMaxGuest {
    public static void main(String[] args) {
        int[] Arrival={800,700,600,500};
        int[] Departure={840,820,830,530};
        MeetingMaxGuest.find(Arrival,Departure);
    }

    private static void find(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i=1;
        int j=0;
        int guest=1;
        int maxGuest=0;
        while(i<arrival.length && j<departure.length){
            if(arrival[i]<departure[j]){
                guest++;
                i++;
            }else if(arrival[i]>departure[j]){
                guest--;
                j++;
            }
            maxGuest=Math.max(maxGuest,guest);
        }
        System.out.println(maxGuest);
    }
}
