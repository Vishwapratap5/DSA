package Package2;
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr={3,0,1,2,5};
        int CurrentLeftMax =arr[0];
        int CurrentRightMax =arr[arr.length-1];
        int waterLevel=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]<arr[right]){
                if(arr[left]> CurrentLeftMax){
                    CurrentLeftMax =arr[left];
                }else{
                    waterLevel+= CurrentLeftMax -arr[left];
                }

            }else{
                if(arr[right]<CurrentRightMax){
                    CurrentRightMax =arr[right];
                }
                else{
                    waterLevel+= CurrentRightMax -arr[right];
                }
            }
            left++;
            right--;
        }
        System.out.println(waterLevel);


    }
}
