import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxRectangularArea {
    static int[] arr={2,1,5,6,2,3};

    public static void main(String[] args) {
        MaxRectangularArea mr = new MaxRectangularArea();
        int[] leftMin=mr.findLeftMin(arr);
        int[] rightMin=mr.findRightMin(arr);
        int Area=mr.findMaxArea(arr,leftMin,rightMin);
        System.out.println(Arrays.toString(leftMin));
        System.out.println(Arrays.toString(rightMin));
        System.out.println(Area);
    }

    private int findMaxArea(int[] arr,int[] leftMin, int[] rightMin) {
        int area=0;
        int maxArea=0;
        for(int i=0;i<leftMin.length;i++){
            int width=rightMin[i]-leftMin[i]-1;
            area=arr[i]*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }

    private int[] findRightMin(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res=new int[arr.length];
        res[arr.length-1]=-1;
        stack.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }

    private int[] findLeftMin(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res=new int[arr.length];
        res[0]=-1;
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }
}
