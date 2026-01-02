import java.util.Arrays;

public class MaximalRectangle {
   static int[][] arr={{1,0,1,0,1},
                       {1,0,1,1,1},
                       {1,1,1,1,1},
                       {1,0,0,1,0}};

    public static void main(String[] args) {
        MaximalRectangle obj = new MaximalRectangle();
        obj.findMax(arr);
    }

    private void findMax(int[][] arr) {
        for(int j=0;j<arr[0].length;j++){
            for(int i=1;i<arr.length;i++){
                if(i==arr.length-1){
                    arr[i][j]=(arr[i][j]==0)?0:(arr[i][j]+arr[i-1][j]);
                }else{
                    arr[i][j] +=arr[i-1][j];
                }
            }
        }
        MaxRectangularArea mr = new MaxRectangularArea();
        int area=0;
        int MaxArea=0;
        for(int i=0;i<arr.length;i++){
            int[] leftMin=mr.findLeftMin(arr[i]);
            int[] rightMin=mr.findRightMin(arr[i]);
            area=mr.findMaxArea(arr[i],leftMin,rightMin);
            MaxArea= Math.max(area,MaxArea);
        }
        System.out.println(MaxArea);
    }
}
