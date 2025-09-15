package Package2;

public class LeaderInArray {
    public static void main(String[] args) {

        int[] arr={5,10,25,10,25,8,7,9};
        int CurrentLeader=arr[arr.length-1];
        System.out.println(CurrentLeader);
        for(int i=arr.length-2;i>=0;i--){
          if(arr[i]>CurrentLeader){
              CurrentLeader=arr[i];
              System.out.println(CurrentLeader);
          }

        }

    }
}
